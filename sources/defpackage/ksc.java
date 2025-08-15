package defpackage;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: ksc  reason: default package */
public abstract class ksc {
    public static final List a;
    public static final List b;

    static {
        Class<csc> cls = csc.class;
        a = y53.M(Application.class, cls);
        b = Collections.singletonList(cls);
    }

    public static final Constructor a(Class cls, List list) {
        Constructor[] constructors = cls.getConstructors();
        int length = constructors.length;
        int i = 0;
        while (i < length) {
            Constructor constructor = constructors[i];
            List m0 = ys.m0(constructor.getParameterTypes());
            if (list.equals(m0)) {
                return constructor;
            }
            if (list.size() != m0.size() || !m0.containsAll(list)) {
                i++;
            } else {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final qnf b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (qnf) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
