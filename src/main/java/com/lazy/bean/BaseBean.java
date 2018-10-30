package com.lazy.bean;

import com.lazy.annotations.Android;
import com.lazy.annotations.Description;
import com.lazy.controls.ControlTpye;
import macaca.client.MacacaClient;

import java.lang.reflect.Field;

public class BaseBean {
    protected MacacaClient driver;

    public BaseBean(MacacaClient aDriver){
        this.driver = aDriver;

        try{
            Field[] fields = this.getClass().getDeclaredFields();

            for (Field field : fields){
                try{
                    ControlTpye.valueOf(field.getType().getSimpleName().toUpperCase());
                }catch (Exception e){
                    continue;
                }

                field.setAccessible(true);
                Object object = field.getType().newInstance();

                //获取bean中的android配置
                if (field.isAnnotationPresent(Android.class)){
                    //获取android中的各个字段
                    String id = field.getAnnotation(Android.class).id();
                    String name = field.getAnnotation(Android.class).name();
                    String xpath = field.getAnnotation(Android.class).xpath();

                    //实例化中abstractcontrol中的androidId
                    Field androididField = getAbstractControl(field).getDeclaredField("androidId");
                    androididField.setAccessible(true);
                    androididField.set(object,id);

                    //实例化中abstractcontrol中的androidId
                    Field androidNameField = getAbstractControl(field).getDeclaredField("androidName");
                    androidNameField.setAccessible(true);
                    androidNameField.set(object,name);
                    //实例化中abstractcontrol中的androidId
                    Field androidXpathField = getAbstractControl(field).getDeclaredField("androidXpath");
                    androidXpathField.setAccessible(true);
                    androidXpathField.set(object,xpath);
                }

                //获取bean中的desc
                if (field.isAnnotationPresent(Description.class)){
                    String description = field.getAnnotation(Description.class)
                            .description();

                    Field descField = getAbstractControl(field)
                            .getDeclaredField("description");
                    descField.setAccessible(true);
                    descField.set(object, description);
                }

                //设置实例化中abstractcontrol中driver
                Field beField = getAbstractControl(field).getDeclaredField(
                        "driver");
                beField.setAccessible(true);
                beField.set(object, driver);

                field.set(this, object);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private Class<?> getAbstractControl(Field field) {
        Class<?> abstractControl = field.getType();

        while (!abstractControl.getSimpleName().equals("AbstractControl")) {
            abstractControl = abstractControl.getSuperclass();
        }

        return abstractControl;
    }
}
