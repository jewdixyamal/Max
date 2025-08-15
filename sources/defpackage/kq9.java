package defpackage;

/* renamed from: kq9  reason: default package */
public final class kq9 implements taf {
    public final eqe a(int i, String str) {
        if (str.length() <= 0) {
            return null;
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt != '-' && charAt != ' ') {
                return null;
            }
        }
        Integer w = fp3.w(i, nec.a(kq9.class));
        if (w != null) {
            return new eqe(w.intValue());
        }
        return null;
    }
}
