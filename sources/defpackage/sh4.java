package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: sh4  reason: default package */
public class sh4 implements oh4 {
    public r5g a = null;
    public boolean b = false;
    public boolean c = false;
    public final r5g d;
    public int e = 1;
    public int f;
    public int g;
    public int h = 1;
    public ek4 i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public sh4(r5g r5g) {
        this.d = r5g;
    }

    public final void a(oh4 oh4) {
        ArrayList arrayList = this.l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((sh4) it.next()).j) {
                return;
            }
        }
        this.c = true;
        r5g r5g = this.a;
        if (r5g != null) {
            r5g.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        sh4 sh4 = null;
        int i2 = 0;
        while (it2.hasNext()) {
            sh4 sh42 = (sh4) it2.next();
            if (!(sh42 instanceof ek4)) {
                i2++;
                sh4 = sh42;
            }
        }
        if (sh4 != null && i2 == 1 && sh4.j) {
            ek4 ek4 = this.i;
            if (ek4 != null) {
                if (ek4.j) {
                    this.f = this.h * ek4.g;
                } else {
                    return;
                }
            }
            d(sh4.g + this.f);
        }
        r5g r5g2 = this.a;
        if (r5g2 != null) {
            r5g2.a(this);
        }
    }

    public final void b(oh4 oh4) {
        this.k.add(oh4);
        if (this.j) {
            oh4.a(oh4);
        }
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i2) {
        if (!this.j) {
            this.j = true;
            this.g = i2;
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                oh4 oh4 = (oh4) it.next();
                oh4.a(oh4);
            }
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.h0);
        sb.append(":");
        switch (this.e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
