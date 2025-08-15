package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: hba  reason: default package */
public final class hba {
    public final /* synthetic */ int a;
    public final long b;
    public final long c;
    public final /* synthetic */ iba d;

    public hba(iba iba, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.d = iba;
                fh8 fh8 = iba.a;
                this.b = fh8.o;
                this.c = fh8.c;
                return;
            default:
                this.d = iba;
                fh8 fh82 = iba.a;
                this.b = fh82.o;
                this.c = fh82.c;
                return;
        }
    }

    public final long a() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return this.b;
        }
    }

    public final long b() {
        switch (this.a) {
            case 0:
                return this.c;
            default:
                return this.c;
        }
    }

    public final void c(ArrayList arrayList) {
        switch (this.a) {
            case 0:
                ((m56) this.d.a.X).invoke(arrayList);
                return;
            default:
                ((m56) this.d.a.X).invoke(arrayList);
                return;
        }
    }

    public final void d(Collection collection) {
        switch (this.a) {
            case 0:
                ((m56) this.d.a.Y).invoke(collection);
                return;
            default:
                ((m56) this.d.a.Y).invoke(collection);
                return;
        }
    }
}
