package defpackage;

/* renamed from: tze  reason: default package */
public final class tze {
    public static final tze d = new tze(new rze[0]);
    public static final String e = Integer.toString(0, 36);
    public final int a;
    public final ffc b;
    public int c;

    static {
        int i = oaf.a;
    }

    public tze(rze... rzeArr) {
        this.b = zw6.k(rzeArr);
        this.a = rzeArr.length;
        int i = 0;
        while (true) {
            ffc ffc = this.b;
            if (i < ffc.size()) {
                int i2 = i + 1;
                for (int i3 = i2; i3 < ffc.size(); i3++) {
                    if (((rze) ffc.get(i)).equals(ffc.get(i3))) {
                        z04.v("", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                }
                i = i2;
            } else {
                return;
            }
        }
    }

    public final rze a(int i) {
        return (rze) this.b.get(i);
    }

    public final int b(rze rze) {
        int indexOf = this.b.indexOf(rze);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tze.class != obj.getClass()) {
            return false;
        }
        tze tze = (tze) obj;
        return this.a == tze.a && this.b.equals(tze.b);
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = this.b.hashCode();
        }
        return this.c;
    }
}
