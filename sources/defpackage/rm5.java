package defpackage;

import android.util.SparseBooleanArray;

/* renamed from: rm5  reason: default package */
public final class rm5 {
    public final /* synthetic */ int a;
    public final SparseBooleanArray b;
    public boolean c;

    public rm5(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new SparseBooleanArray();
                return;
            default:
                this.b = new SparseBooleanArray();
                return;
        }
    }

    public final void a(int i) {
        switch (this.a) {
            case 0:
                np8.f(!this.c);
                this.b.append(i, true);
                return;
            default:
                fm9.k(!this.c);
                this.b.append(i, true);
                return;
        }
    }

    public void b(tm5 tm5) {
        for (int i = 0; i < tm5.a.size(); i++) {
            a(tm5.b(i));
        }
    }

    public void c(int... iArr) {
        for (int a2 : iArr) {
            a(a2);
        }
    }

    public sm5 d() {
        np8.f(!this.c);
        this.c = true;
        return new sm5(this.b);
    }

    public tm5 e() {
        fm9.k(!this.c);
        this.c = true;
        return new tm5(this.b);
    }
}
