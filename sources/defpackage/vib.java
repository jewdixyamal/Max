package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* renamed from: vib  reason: default package */
public abstract class vib extends bjb {
    public final boolean h(ol7 ol7) {
        if (equals(sib.a)) {
            return ol7 instanceof sib;
        }
        if (this instanceof tib) {
            return ol7 instanceof tib;
        }
        if (this instanceof uib) {
            return (ol7 instanceof uib) && ((uib) this).a.a == ((uib) ol7).a.a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean t(Object obj) {
        ol7 ol7 = (ol7) obj;
        if (equals(sib.a)) {
            return ol7 instanceof sib;
        }
        if (this instanceof tib) {
            return ol7 instanceof tib;
        }
        if (this instanceof uib) {
            return (ol7 instanceof uib) && tpa.f(((uib) this).a, ((uib) ol7).a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
