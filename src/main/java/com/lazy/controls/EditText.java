package com.lazy.controls;

import com.lazy.exceptions.NoSuchElementException;
import com.lazy.exceptions.ProxyError;
import com.lazy.interfaces.Clearable;
import com.lazy.interfaces.Clickable;
import com.lazy.interfaces.Inputable;

public class EditText  extends  AbstractControl implements Inputable,Clickable,Clearable {
    public void input(String value) {
        try {
             findElement().sendKeys(value);
        } catch (NoSuchElementException e){
            throw new NoSuchElementException(e.getMessage());
        }
        catch (Exception e) {
            throw new ProxyError(e.getMessage());
        }
    }

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
        try{
            findElement().click();
        }catch (NoSuchElementException e){
            throw new NoSuchElementException(e.getMessage());
        }
        catch (Exception e) {
            throw new ProxyError(e.getMessage());
        }
    }

    public void clear() {
        try{
            findElement().clearText();
        }catch (NoSuchElementException e){
            throw new NoSuchElementException(e.getMessage());
        }
        catch (Exception e) {
            throw new ProxyError(e.getMessage());
        }
    }
}
