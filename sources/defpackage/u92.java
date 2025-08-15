package defpackage;

/* renamed from: u92  reason: default package */
public final class u92 extends hqd {
    /* renamed from: E */
    public final void A(v92 v92) {
        t92 t92 = (t92) this.a;
        t92.setTitle(v92.a);
        t92.setSubtitle(v92.b);
        t92.a.setCustomOverlay(v92.Y);
        Long valueOf = Long.valueOf(v92.X);
        CharSequence charSequence = v92.o;
        if (charSequence == null) {
            charSequence = "";
        }
        s5a.i(t92.a, v92.c, valueOf, charSequence);
        t92.setDescriptions(v92.Z);
    }
}
