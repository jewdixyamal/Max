package defpackage;

/* renamed from: sze  reason: default package */
public final class sze implements su0 {
    public static final sze o = new sze(new qze[0]);
    public final int a;
    public final ffc b;
    public int c;

    public sze(qze... qzeArr) {
        this.b = zw6.k(qzeArr);
        this.a = qzeArr.length;
        int i = 0;
        while (true) {
            ffc ffc = this.b;
            if (i < ffc.size()) {
                int i2 = i + 1;
                for (int i3 = i2; i3 < ffc.size(); i3++) {
                    if (((qze) ffc.get(i)).equals(ffc.get(i3))) {
                        fm9.r(new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                }
                i = i2;
            } else {
                return;
            }
        }
    }

    public final qze a(int i) {
        return (qze) this.b.get(i);
    }

    public final int b(qze qze) {
        int indexOf = this.b.indexOf(qze);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sze.class != obj.getClass()) {
            return false;
        }
        sze sze = (sze) obj;
        return this.a == sze.a && this.b.equals(sze.b);
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = this.b.hashCode();
        }
        return this.c;
    }
}
