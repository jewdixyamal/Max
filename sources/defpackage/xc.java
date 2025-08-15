package defpackage;

/* renamed from: xc  reason: default package */
public final class xc implements taf {
    public final qec a = new qec("^[a-zA-ZА-я\\u0401\\u0451\\u00eb\\u00cb\\- ]+$");

    public final eqe a(int i, String str) {
        Integer w;
        if (str.length() <= 0 || this.a.a(str) || (w = fp3.w(i, nec.a(xc.class))) == null) {
            return null;
        }
        return new eqe(w.intValue());
    }
}
