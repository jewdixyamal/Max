package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;

/* renamed from: ne4  reason: default package */
public final class ne4 extends i0f {
    public static final /* synthetic */ int Z0 = 0;
    public final int K0;
    public final boolean L0;
    public final boolean M0;
    public final boolean N0;
    public final boolean O0;
    public final boolean P0;
    public final boolean Q0;
    public final boolean R0;
    public final boolean S0;
    public final boolean T0;
    public final boolean U0;
    public final boolean V0;
    public final boolean W0;
    public final SparseArray X0;
    public final SparseBooleanArray Y0;

    static {
        new ne4(new pe4());
    }

    public ne4(pe4 pe4) {
        super(pe4);
        this.L0 = pe4.z;
        this.M0 = pe4.A;
        this.N0 = pe4.B;
        this.O0 = pe4.C;
        this.P0 = pe4.D;
        this.Q0 = pe4.E;
        this.R0 = pe4.F;
        this.S0 = pe4.G;
        this.T0 = pe4.H;
        this.K0 = pe4.I;
        this.U0 = pe4.J;
        this.V0 = pe4.K;
        this.W0 = pe4.L;
        this.X0 = pe4.M;
        this.Y0 = pe4.N;
    }

    public final qe4 a(int i, sze sze) {
        Map map = (Map) this.X0.get(i);
        if (map != null) {
            return (qe4) map.get(sze);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ne4.class != obj.getClass()) {
            return false;
        }
        ne4 ne4 = (ne4) obj;
        if (super.equals(ne4) && this.L0 == ne4.L0 && this.M0 == ne4.M0 && this.N0 == ne4.N0 && this.O0 == ne4.O0 && this.P0 == ne4.P0 && this.Q0 == ne4.Q0 && this.R0 == ne4.R0 && this.S0 == ne4.S0 && this.T0 == ne4.T0 && this.K0 == ne4.K0 && this.U0 == ne4.U0 && this.V0 == ne4.V0 && this.W0 == ne4.W0) {
            SparseBooleanArray sparseBooleanArray = this.Y0;
            int size = sparseBooleanArray.size();
            SparseBooleanArray sparseBooleanArray2 = ne4.Y0;
            if (sparseBooleanArray2.size() == size) {
                int i = 0;
                while (true) {
                    if (i >= size) {
                        SparseArray sparseArray = this.X0;
                        int size2 = sparseArray.size();
                        SparseArray sparseArray2 = ne4.X0;
                        if (sparseArray2.size() == size2) {
                            int i2 = 0;
                            while (i2 < size2) {
                                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                if (indexOfKey >= 0) {
                                    Map map = (Map) sparseArray.valueAt(i2);
                                    Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                    if (map2.size() == map.size()) {
                                        for (Map.Entry entry : map.entrySet()) {
                                            sze sze = (sze) entry.getKey();
                                            if (map2.containsKey(sze)) {
                                                if (!maf.a(entry.getValue(), map2.get(sze))) {
                                                }
                                            }
                                        }
                                        i2++;
                                    }
                                }
                            }
                            return true;
                        }
                    } else if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.L0 ? 1 : 0)) * 31) + (this.M0 ? 1 : 0)) * 31) + (this.N0 ? 1 : 0)) * 31) + (this.O0 ? 1 : 0)) * 31) + (this.P0 ? 1 : 0)) * 31) + (this.Q0 ? 1 : 0)) * 31) + (this.R0 ? 1 : 0)) * 31) + (this.S0 ? 1 : 0)) * 31) + (this.T0 ? 1 : 0)) * 31) + this.K0) * 31) + (this.U0 ? 1 : 0)) * 31) + (this.V0 ? 1 : 0)) * 31) + (this.W0 ? 1 : 0);
    }
}
