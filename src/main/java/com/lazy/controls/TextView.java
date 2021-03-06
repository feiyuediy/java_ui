package com.lazy.controls;

import com.lazy.exceptions.NoSuchElementException;
import com.lazy.exceptions.ProxyError;
import com.lazy.interfaces.Clickable;
import com.lazy.interfaces.GetTextable;
import com.lazy.interfaces.Inputable;
import com.xiaoaiai.Moudle.BaseCase;

public class TextView  extends  AbstractControl implements GetTextable, Clickable{

    public String getText() {
        String text = null;
        try {
            text = findElement().getText();
        } catch (NoSuchElementException e){
            throw new NoSuchElementException(e.getMessage());
        }
        catch (Exception e) {
            throw new ProxyError(e.getMessage());
        }
        return text;
    }

    public void click() {
        try {
            findElement().click();
        }catch (NoSuchElementException e){
            throw new NoSuchElementException(e.getMessage());
        }
        catch (Exception e) {
            throw new ProxyError(e.getMessage());
        }
    }
}
