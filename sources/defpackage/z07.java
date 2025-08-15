package defpackage;

import java.util.List;

/* renamed from: z07  reason: default package */
public final class z07 implements ic7 {
    public static final /* synthetic */ int c = 0;
    public final List a;
    public final String b;

    static {
        new z07(new y07());
    }

    public z07(y07 y07) {
        this.a = y07.a;
        this.b = y07.b;
    }

    public final boolean a(ic7 ic7) {
        if (ic7 == null) {
            return false;
        }
        z07 z07 = (z07) ic7;
        if (!oag.d(z07.b, this.b)) {
            return false;
        }
        List list = this.a;
        int size = list.size();
        List list2 = z07.a;
        if (size != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            lv0 lv0 = (lv0) list.get(i);
            if (lv0.size() != ((lv0) list2.get(i)).size()) {
                return false;
            }
            for (int i2 = 0; i2 < lv0.size(); i2++) {
                if (!((fv0) lv0.get(i2)).equals(((lv0) list2.get(i)).get(i2))) {
                    return false;
                }
            }
        }
        return true;
    }
}
