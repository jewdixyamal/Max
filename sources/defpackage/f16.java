package defpackage;

import androidx.fragment.app.a;
import androidx.fragment.app.c;
import java.lang.reflect.InvocationTargetException;

/* renamed from: f16  reason: default package */
public final class f16 {
    public static final qpd b = new qpd();
    public final /* synthetic */ c a;

    public f16(c cVar) {
        this.a = cVar;
    }

    public static Class b(ClassLoader classLoader, String str) {
        qpd qpd = b;
        qpd qpd2 = (qpd) qpd.get(classLoader);
        if (qpd2 == null) {
            qpd2 = new qpd();
            qpd.put(classLoader, qpd2);
        }
        Class cls = (Class) qpd2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        qpd2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(zr6.i("Unable to instantiate fragment ", str, ": make sure class name exists"), e);
        } catch (ClassCastException e2) {
            throw new RuntimeException(zr6.i("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e2);
        }
    }

    public final a a(String str) {
        try {
            return (a) c(this.a.w.u0.getClassLoader(), str).getConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (InstantiationException e) {
            throw new RuntimeException(zr6.i("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(zr6.i("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(zr6.i("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(zr6.i("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
