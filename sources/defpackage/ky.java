package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: ky  reason: default package */
public final class ky extends oy {
    public final ArrayList X = new ArrayList();
    public final long c;
    public final ArrayList o = new ArrayList();

    public ky(int i, long j) {
        super(i, 0);
        this.c = j;
    }

    public final String toString() {
        String d = oy.d(this.b);
        String arrays = Arrays.toString(this.o.toArray());
        String arrays2 = Arrays.toString(this.X.toArray());
        StringBuilder sb = new StringBuilder(rh4.e(rh4.e(rh4.e(22, d), arrays), arrays2));
        sb.append(d);
        sb.append(" leaves: ");
        sb.append(arrays);
        sb.append(" containers: ");
        sb.append(arrays2);
        return sb.toString();
    }

    public final ky v(int i) {
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ky kyVar = (ky) arrayList.get(i2);
            if (kyVar.b == i) {
                return kyVar;
            }
        }
        return null;
    }

    public final my w(int i) {
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            my myVar = (my) arrayList.get(i2);
            if (myVar.b == i) {
                return myVar;
            }
        }
        return null;
    }
}
