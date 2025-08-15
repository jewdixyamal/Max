package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: z67  reason: default package */
public final class z67 extends e77 {
    public final a66 Y;
    public final m56 Z;

    public z67(bk bkVar, m6e m6e) {
        super(3, 0);
        this.Y = bkVar;
        this.Z = m6e;
    }

    public final void a(RecyclerView recyclerView, dec dec) {
        super.a(recyclerView, dec);
        if (dec instanceof zp4) {
            ((s3e) ((zp4) dec)).a.animate().translationZ(0.0f);
            this.Z.invoke(dec);
        }
    }

    public final boolean i(dec dec, dec dec2) {
        this.Y.invoke(Integer.valueOf(dec.g()), Integer.valueOf(dec2.g()));
        return true;
    }

    public final void j(dec dec, int i) {
        if (i != 0 && (dec instanceof zp4)) {
            ((s3e) ((zp4) dec)).a.animate().translationZ(fk4.d().getDisplayMetrics().density * 20.0f);
        }
    }
}
