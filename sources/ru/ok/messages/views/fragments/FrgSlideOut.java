package ru.ok.messages.views.fragments;

import ru.ok.messages.views.fragments.base.FrgBase;

public abstract class FrgSlideOut extends FrgBase implements tsd {
    public boolean B1 = true;

    public boolean D() {
        return true;
    }

    public void M(int i) {
        if (g1() != null) {
            b0().finish();
            b0().overridePendingTransition(0, 0);
        }
    }

    public void O() {
        b56 r1 = r1();
        if (r1 != null) {
            this.B1 = r1.f();
            r1.c(false, true, true);
        }
    }

    public void m1(q5 q5Var) {
        this.n1 = false;
        if (!(q5Var instanceof b56)) {
            throw new RuntimeException("Parent activity must implement FrgSlideOut.Listener interface");
        }
    }

    public final void q() {
        b56 r1 = r1();
        if (r1 != null && this.B1) {
            r1.c(true, true, false);
        }
    }

    public b56 r1() {
        if (g1() != null) {
            return (b56) g1();
        }
        return null;
    }
}
