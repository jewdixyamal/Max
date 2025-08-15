package defpackage;

import java.lang.ref.WeakReference;
import one.me.sdk.arch.Widget;
import one.me.sdk.arch.internal.BinderNotFoundValueException;

/* renamed from: qm0  reason: default package */
public final class qm0 implements q7c, je7 {
    public WeakReference X;
    public final pm0 Y;
    public final m56 a;
    public final a66 b;
    public final m56 c;
    public Object o;

    public qm0(uu3 uu3, m56 m56, a66 a66, m56 m562) {
        this.a = m56;
        this.b = a66;
        this.c = m562;
        this.Y = new pm0(this, uu3);
    }

    public final Object T0(Object obj, bc7 bc7) {
        Widget widget = (Widget) obj;
        return getValue();
    }

    public final boolean a() {
        return this.o != null;
    }

    public final Object getValue() {
        Object obj = this.o;
        if (obj == null) {
            WeakReference weakReference = this.X;
            obj = weakReference != null ? weakReference.get() : null;
        }
        if (obj != null && ((Boolean) this.c.invoke(obj)).booleanValue()) {
            return obj;
        }
        try {
            Object invoke = this.a.invoke(obj);
            this.o = invoke;
            pm0 pm0 = this.Y;
            pm0.a = false;
            a66 a66 = this.b;
            if (a66 != null) {
                a66.invoke(invoke, pm0);
            }
            return invoke;
        } catch (BinderNotFoundValueException e) {
            throw e;
        } catch (Throwable th) {
            throw new BinderNotFoundValueException(th, 1);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qm0(uu3 uu3, m56 m56, a5g a5g, int i) {
        this(uu3, m56, (a66) (i & 4) != 0 ? null : a5g, (m56) new k8(17));
    }
}
