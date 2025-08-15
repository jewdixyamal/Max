package defpackage;

/* renamed from: r9  reason: default package */
public final class r9 implements dab {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ r9(dab dab, int i) {
        this.a = i;
        this.b = dab;
    }

    public final void a(fi0 fi0, eab eab) {
        switch (this.a) {
            case 0:
                ((dab) this.b).a(new q9(fi0, 0), eab);
                return;
            case 1:
                ((dab) this.b).a(new q9(fi0, 2), eab);
                return;
            case 2:
                ((dab) this.b).a(new q9(fi0, 3), eab);
                return;
            default:
                if (((oj0) eab).a.i == null) {
                    fi0.g(1, (Object) null);
                    return;
                } else if (!c(0, fi0, eab)) {
                    fi0.g(1, (Object) null);
                    return;
                } else {
                    return;
                }
        }
    }

    public boolean c(int i, fi0 fi0, eab eab) {
        nte[] nteArr;
        jic jic = ((oj0) eab).a.i;
        while (true) {
            nteArr = (nte[]) this.b;
            if (i >= nteArr.length) {
                i = -1;
                break;
            } else if (nteArr[i].b(jic)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return false;
        }
        nteArr[i].a(new mte(this, fi0, eab, i), eab);
        return true;
    }

    public r9(nte[] nteArr) {
        this.a = 3;
        nte[] nteArr2 = nteArr;
        this.b = nteArr2;
        od2.m(0, nteArr2.length);
    }
}
