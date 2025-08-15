package defpackage;

import java.lang.reflect.Method;
import java.util.Arrays;

/* renamed from: e54  reason: default package */
public final class e54 implements q7c {
    public static final Object X = new Object();
    public final k56 a;
    public final String b;
    public final Class[] c;
    public volatile Object o;

    public e54(k56 k56, String str, Class... clsArr) {
        this.a = k56;
        this.b = str;
        this.c = clsArr;
        this.o = X;
    }

    public final Object T0(Object obj, bc7 bc7) {
        Method method;
        if (this.o == X) {
            try {
                String str = this.b;
                Class[] clsArr = this.c;
                method = ((Class) this.a.invoke()).getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
                method.setAccessible(true);
            } catch (Exception unused) {
                method = null;
            }
            this.o = method;
        }
        return (Method) this.o;
    }

    public /* synthetic */ e54(qk2 qk2, String str) {
        this(qk2, str, new Class[0]);
    }
}
