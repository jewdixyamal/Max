package defpackage;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import java.lang.reflect.InvocationTargetException;

/* renamed from: unf  reason: default package */
public final class unf extends wnf {
    public static unf c;
    public static final pq9 d = new Object();
    public final Application b;

    public unf(Application application) {
        this.b = application;
    }

    public static qnf d(Class cls, Application application) {
        if (!AndroidViewModel.class.isAssignableFrom(cls)) {
            return kq0.h(cls);
        }
        try {
            return (qnf) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{application});
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Cannot create an instance of " + cls, e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        }
    }

    public final qnf a(Class cls) {
        Application application = this.b;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    public final qnf b(Class cls, wh9 wh9) {
        if (this.b != null) {
            return a(cls);
        }
        Application application = (Application) wh9.a.get(d);
        if (application != null) {
            return d(cls, application);
        }
        if (!AndroidViewModel.class.isAssignableFrom(cls)) {
            return kq0.h(cls);
        }
        throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
    }
}
