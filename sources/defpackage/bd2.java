package defpackage;

/* renamed from: bd2  reason: default package */
public final class bd2 extends of2 {
    public final void E(xm8 xm8, m56 m56, a66 a66) {
        vm8 vm8 = (vm8) xm8;
        lf2 lf2 = (lf2) this.a;
        A(vm8);
        tu0.K(lf2, 300, new yc2(m56, vm8, 2));
        lf2.setOnLongClickListener(new zc2(a66, vm8, this, 1));
    }

    /* renamed from: F */
    public final void A(vm8 vm8) {
        lf2 lf2 = (lf2) this.a;
        lf2.setId((int) vm8.a);
        lf2.setTitle(vm8.X);
        CharSequence charSequence = vm8.Z;
        if (charSequence != null) {
            lf2.setLink(charSequence);
        }
        lf2.setSubtitle(vm8.Y);
        lf2.setLinkPhoto(vm8.o);
    }
}
