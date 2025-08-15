package defpackage;

/* renamed from: y63  reason: default package */
public final class y63 extends rd7 implements a66 {
    public static final y63 b = new y63(2, 0);
    public static final y63 c = new y63(2, 1);
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y63(int i, int i2) {
        super(i);
        this.a = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        z63 z63;
        switch (this.a) {
            case 0:
                String str = (String) obj;
                jx3 jx3 = (jx3) obj2;
                if (str.length() == 0) {
                    return jx3.toString();
                }
                return str + ", " + jx3;
            default:
                jx3 jx32 = (jx3) obj2;
                lx3 minusKey = ((lx3) obj).minusKey(jx32.getKey());
                hz4 hz4 = hz4.a;
                if (minusKey == hz4) {
                    return jx32;
                }
                vu4 vu4 = vu4.b;
                iu3 iu3 = (iu3) minusKey.get(vu4);
                if (iu3 == null) {
                    z63 = new z63(minusKey, jx32);
                } else {
                    lx3 minusKey2 = minusKey.minusKey(vu4);
                    if (minusKey2 == hz4) {
                        return new z63(jx32, iu3);
                    }
                    z63 = new z63(new z63(minusKey2, jx32), iu3);
                }
                return z63;
        }
    }
}
