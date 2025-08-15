package defpackage;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* renamed from: hk4  reason: default package */
public final class hk4 implements ct0 {
    public static final /* synthetic */ bc7[] c;
    public final e54 a = new e54(new qk2(3, "sun.nio.ch.DirectBuffer"), "cleaner");
    public final e54 b = new e54(new qk2(3, "sun.misc.Cleaner"), "clean");

    static {
        Class<hk4> cls = hk4.class;
        c = new bc7[]{new hob(cls, "cleanerGetter", "getCleanerGetter()Ljava/lang/reflect/Method;", 0), zr6.e(nec.a, cls, "cleanMethod", "getCleanMethod()Ljava/lang/reflect/Method;", 0)};
    }

    public final ByteBuffer a(int i) {
        return ByteBuffer.allocateDirect(i);
    }

    public final void b(ByteBuffer byteBuffer) {
        Object invoke;
        bc7[] bc7Arr = c;
        Method method = (Method) this.a.T0(this, bc7Arr[0]);
        if (method != null && (invoke = method.invoke(byteBuffer, (Object[]) null)) != null) {
            Method method2 = (Method) this.b.T0(this, bc7Arr[1]);
            if (method2 != null) {
                method2.invoke(invoke, (Object[]) null);
            }
        }
    }
}
