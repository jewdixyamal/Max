package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: lb4  reason: default package */
public final class lb4 extends m06 {
    public final /* synthetic */ int w0;
    public final Map x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lb4(int i, Map map) {
        super(10);
        this.w0 = i;
        this.x0 = map;
    }

    public final boolean containsKey(Object obj) {
        switch (this.w0) {
            case 0:
                return obj != null && super.containsKey(obj);
            default:
                return obj != null && super.containsKey(obj);
        }
    }

    public final Set entrySet() {
        switch (this.w0) {
            case 0:
                return ngg.s(super.entrySet(), new kb4(2));
            default:
                return ngg.s(super.entrySet(), new kb4(1));
        }
    }

    public final boolean equals(Object obj) {
        switch (this.w0) {
            case 0:
                return obj != null && ngg.q(this, obj);
            default:
                return obj != null && ngg.q(this, obj);
        }
    }

    public final Object get(Object obj) {
        switch (this.w0) {
            case 0:
                if (obj == null) {
                    return null;
                }
                return (List) super.get(obj);
            default:
                if (obj == null) {
                    return null;
                }
                return (List) super.get(obj);
        }
    }

    public final int hashCode() {
        switch (this.w0) {
            case 0:
                return ngg.v(entrySet());
            default:
                return ngg.v(entrySet());
        }
    }

    public final boolean isEmpty() {
        switch (this.w0) {
            case 0:
                if (!super.isEmpty()) {
                    return super.size() == 1 && super.containsKey((Object) null);
                }
                return true;
            default:
                if (!super.isEmpty()) {
                    return super.size() == 1 && super.containsKey((Object) null);
                }
                return true;
        }
    }

    public final Set keySet() {
        switch (this.w0) {
            case 0:
                return ngg.s(super.keySet(), new kb4(0));
            default:
                return ngg.s(super.keySet(), new kb4(3));
        }
    }

    public final int size() {
        switch (this.w0) {
            case 0:
                return super.size() - (super.containsKey((Object) null) ? 1 : 0);
            default:
                return super.size() - (super.containsKey((Object) null) ? 1 : 0);
        }
    }

    public final Map u0() {
        switch (this.w0) {
            case 0:
                return this.x0;
            default:
                return this.x0;
        }
    }

    public final Object z() {
        switch (this.w0) {
            case 0:
                return this.x0;
            default:
                return this.x0;
        }
    }
}
