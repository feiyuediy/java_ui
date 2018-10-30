package com.lazy.controls;

import com.lazy.exceptions.NoSuchElementException;
import com.lazy.exceptions.ProxyError;
import com.lazy.interfaces.Clickable;

public class ImageView  extends  AbstractControl implements Clickable {
    public void click() {
      try{
          findElement().click();
      }catch (Exception e){
          throw new NoSuchElementException(e.getMessage());
      }
    }
}
