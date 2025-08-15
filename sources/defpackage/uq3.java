package defpackage;

import java.io.Serializable;

/* renamed from: uq3  reason: default package */
public final class uq3 extends gle implements Serializable {
    public int c;
    public String o;

    public uq3(gy8 gy8) {
        super(gy8);
    }

    public final void b(gy8 gy8, String str) {
        int i;
        str.getClass();
        if (str.equals("verifyResult")) {
            String P = lz7.P(gy8);
            if (P != null) {
                if (P.equals("GOOD")) {
                    i = 1;
                } else if (P.equals("BAD")) {
                    i = 2;
                } else if (P.equals("UNDEFINED")) {
                    i = 3;
                } else {
                    throw new IllegalArgumentException("No enum constant ru.ok.tamtam.api.commands.ContactVerifyCmd.VerifyResult.".concat(P));
                }
                this.c = i;
                return;
            }
            throw new NullPointerException("Name is null");
        } else if (!str.equals("name")) {
            gy8.z();
        } else {
            this.o = lz7.P(gy8);
        }
    }

    public final String toString() {
        int i = this.c;
        String str = this.o;
        StringBuilder sb = new StringBuilder("{verifyResult=");
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "UNDEFINED" : "BAD" : "GOOD");
        sb.append(", name='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }
}
