package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: h23  reason: default package */
public final class h23 implements nb7, f23 {
    public static final Map b;
    public static final HashMap c;
    public static final LinkedHashMap o;
    public final Class a;

    static {
        List M = y53.M(k56.class, m56.class, a66.class, c66.class, e66.class, g66.class, h66.class, i66.class, j66.class, k66.class, l56.class, n56.class, o56.class, p56.class, q56.class, r56.class, s56.class, t56.class, u56.class, v56.class, x56.class, y56.class, z56.class);
        ArrayList arrayList = new ArrayList(z53.S(M, 10));
        int i = 0;
        for (Object next : M) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new kpa((Class) next, Integer.valueOf(i)));
                i = i2;
            } else {
                y53.R();
                throw null;
            }
        }
        b = mz7.c0(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        for (String str : hashMap.values()) {
            hashMap3.put("kotlin.jvm.internal." + w9e.V0(str) + "CompanionObject", str + ".Companion");
        }
        for (Map.Entry entry : b.entrySet()) {
            int intValue = ((Number) entry.getValue()).intValue();
            hashMap3.put(((Class) entry.getKey()).getName(), "kotlin.Function" + intValue);
        }
        c = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(mz7.Z(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), w9e.V0((String) entry2.getValue()));
        }
        o = linkedHashMap;
    }

    public h23(Class cls) {
        this.a = cls;
    }

    public final Class a() {
        return this.a;
    }

    public final String b() {
        String str;
        Class cls = this.a;
        String str2 = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (cls.isLocalClass()) {
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                return w9e.U0(simpleName, enclosingMethod.getName() + '$');
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                return w9e.U0(simpleName, enclosingConstructor.getName() + '$');
            }
            int z0 = w9e.z0(simpleName, '$', 0, false, 6);
            return z0 == -1 ? simpleName : simpleName.substring(z0 + 1, simpleName.length());
        }
        boolean isArray = cls.isArray();
        LinkedHashMap linkedHashMap = o;
        if (isArray) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                str2 = str.concat("Array");
            }
            return str2 == null ? "Array" : str2;
        }
        String str3 = (String) linkedHashMap.get(cls.getName());
        return str3 == null ? cls.getSimpleName() : str3;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof h23) && ft.j(this).equals(ft.j((nb7) obj));
    }

    public final int hashCode() {
        return ft.j(this).hashCode();
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
