package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Arrays;

/* renamed from: cv3  reason: default package */
public abstract class cv3 {
    public static final /* synthetic */ bc7[] a;
    public static final e54 b = new e54(bv3.b, "inflate", (Class[]) Arrays.copyOf(new Class[]{ViewGroup.class}, 1));
    public static final e54 c = new e54(bv3.c, "removeViewReference", (Class[]) Arrays.copyOf(new Class[]{Context.class}, 1));
    public static final e54 d = new e54(bv3.o, "setNeedsAttach", (Class[]) Arrays.copyOf(new Class[]{Boolean.TYPE}, 1));

    static {
        gob gob = new gob("methodInflate", "getMethodInflate()Ljava/lang/reflect/Method;");
        nec.a.getClass();
        a = new bc7[]{gob, new gob("methodRemoveViewReference", "getMethodRemoveViewReference()Ljava/lang/reflect/Method;"), new gob("methodSetNeedsAttach", "getMethodSetNeedsAttach()Ljava/lang/reflect/Method;")};
    }
}
