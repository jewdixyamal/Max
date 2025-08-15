package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: k23  reason: default package */
public final class k23 {
    public static final k23 c = new k23();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap hashMap, j23 j23, eg7 eg7, Class cls) {
        eg7 eg72 = (eg7) hashMap.get(j23);
        if (eg72 != null && eg7 != eg72) {
            Method method = j23.b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + eg72 + ", new value " + eg7);
        } else if (eg72 == null) {
            hashMap.put(j23, eg7);
        }
    }

    public final i23 a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.a;
        if (superclass != null) {
            i23 i23 = (i23) hashMap2.get(superclass);
            if (i23 == null) {
                i23 = a(superclass, (Method[]) null);
            }
            hashMap.putAll(i23.b);
        }
        for (Class cls2 : cls.getInterfaces()) {
            i23 i232 = (i23) hashMap2.get(cls2);
            if (i232 == null) {
                i232 = a(cls2, (Method[]) null);
            }
            for (Map.Entry entry : i232.b.entrySet()) {
                b(hashMap, (j23) entry.getKey(), (eg7) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            p3a p3a = (p3a) method.getAnnotation(p3a.class);
            if (p3a != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (eh7.class.isAssignableFrom(parameterTypes[0])) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                eg7 value = p3a.value();
                if (parameterTypes.length > 1) {
                    if (!eg7.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == eg7.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    b(hashMap, new j23(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        i23 i233 = new i23(hashMap);
        hashMap2.put(cls, i233);
        this.b.put(cls, Boolean.valueOf(z));
        return i233;
    }
}
