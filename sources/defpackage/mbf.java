package defpackage;

/* renamed from: mbf  reason: default package */
public abstract class mbf extends lbf {
    public sra[] a = null;
    public String b;
    public int c = 0;
    public final int d;

    public mbf() {
    }

    public sra[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(sra[] sraArr) {
        if (!m6d.a(this.a, sraArr)) {
            this.a = m6d.j(sraArr);
            return;
        }
        sra[] sraArr2 = this.a;
        for (int i = 0; i < sraArr.length; i++) {
            sraArr2[i].a = sraArr[i].a;
            int i2 = 0;
            while (true) {
                float[] fArr = sraArr[i].b;
                if (i2 >= fArr.length) {
                    break;
                }
                sraArr2[i].b[i2] = fArr[i2];
                i2++;
            }
        }
    }

    public mbf(mbf mbf) {
        this.b = mbf.b;
        this.d = mbf.d;
        this.a = m6d.j(mbf.a);
    }
}
