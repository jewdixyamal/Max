package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: dec  reason: default package */
public abstract class dec {
    public static final List E0 = Collections.emptyList();
    public int A0 = 0;
    public int B0 = -1;
    public RecyclerView C0;
    public hdc D0;
    public long X = -1;
    public int Y = -1;
    public int Z = -1;
    public final View a;
    public WeakReference b;
    public int c = -1;
    public int o = -1;
    public dec s0 = null;
    public dec t0 = null;
    public int u0;
    public ArrayList v0 = null;
    public List w0 = null;
    public int x0 = 0;
    public vdc y0 = null;
    public boolean z0 = false;

    public dec(View view) {
        if (view != null) {
            this.a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void f(int i) {
        this.u0 = i | this.u0;
    }

    public final int g() {
        RecyclerView recyclerView = this.C0;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.P(this);
    }

    public final int h() {
        RecyclerView recyclerView;
        hdc adapter;
        int P;
        if (this.D0 == null || (recyclerView = this.C0) == null || (adapter = recyclerView.getAdapter()) == null || (P = this.C0.P(this)) == -1) {
            return -1;
        }
        return adapter.i(this.D0, this, P);
    }

    public final int i() {
        int i = this.Z;
        return i == -1 ? this.c : i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r2.v0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List j() {
        /*
            r2 = this;
            int r0 = r2.u0
            r0 = r0 & 1024(0x400, float:1.435E-42)
            java.util.List r1 = E0
            if (r0 != 0) goto L_0x0016
            java.util.ArrayList r0 = r2.v0
            if (r0 == 0) goto L_0x0016
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0013
            goto L_0x0016
        L_0x0013:
            java.util.List r2 = r2.w0
            return r2
        L_0x0016:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dec.j():java.util.List");
    }

    public final boolean k(int i) {
        return (this.u0 & i) != 0;
    }

    public final boolean l() {
        View view = this.a;
        return (view.getParent() == null || view.getParent() == this.C0) ? false : true;
    }

    public final boolean m() {
        return (this.u0 & 1) != 0;
    }

    public final boolean n() {
        return (this.u0 & 4) != 0;
    }

    public final boolean o() {
        if ((this.u0 & 16) == 0) {
            WeakHashMap weakHashMap = zmf.a;
            if (!this.a.hasTransientState()) {
                return true;
            }
        }
        return false;
    }

    public final boolean p() {
        return (this.u0 & 8) != 0;
    }

    public final boolean q() {
        return this.y0 != null;
    }

    public final boolean r() {
        return (this.u0 & 256) != 0;
    }

    public final boolean s() {
        return (this.u0 & 2) != 0;
    }

    public final void t(int i, boolean z) {
        if (this.o == -1) {
            this.o = this.c;
        }
        if (this.Z == -1) {
            this.Z = this.c;
        }
        if (z) {
            this.Z += i;
        }
        this.c += i;
        View view = this.a;
        if (view.getLayoutParams() != null) {
            ((pdc) view.getLayoutParams()).c = true;
        }
    }

    public final String toString() {
        StringBuilder o2 = rh4.o(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
        o2.append(Integer.toHexString(hashCode()));
        o2.append(" position=");
        o2.append(this.c);
        o2.append(" id=");
        o2.append(this.X);
        o2.append(", oldPos=");
        o2.append(this.o);
        o2.append(", pLpos:");
        o2.append(this.Z);
        StringBuilder sb = new StringBuilder(o2.toString());
        if (q()) {
            sb.append(" scrap ");
            sb.append(this.z0 ? "[changeScrap]" : "[attachedScrap]");
        }
        if (n()) {
            sb.append(" invalid");
        }
        if (!m()) {
            sb.append(" unbound");
        }
        if ((this.u0 & 2) != 0) {
            sb.append(" update");
        }
        if (p()) {
            sb.append(" removed");
        }
        if (w()) {
            sb.append(" ignored");
        }
        if (r()) {
            sb.append(" tmpDetached");
        }
        if (!o()) {
            sb.append(" not recyclable(" + this.x0 + ")");
        }
        if ((this.u0 & 512) != 0 || n()) {
            sb.append(" undefined adapter position");
        }
        if (this.a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    public final void u() {
        if (!RecyclerView.L1 || !r()) {
            this.u0 = 0;
            this.c = -1;
            this.o = -1;
            this.X = -1;
            this.Z = -1;
            this.x0 = 0;
            this.s0 = null;
            this.t0 = null;
            ArrayList arrayList = this.v0;
            if (arrayList != null) {
                arrayList.clear();
            }
            this.u0 &= -1025;
            this.A0 = 0;
            this.B0 = -1;
            RecyclerView.o(this);
            return;
        }
        throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
    }

    public final void v(boolean z) {
        int i = this.x0;
        int i2 = z ? i - 1 : i + 1;
        this.x0 = i2;
        if (i2 < 0) {
            this.x0 = 0;
            if (!RecyclerView.L1) {
                toString();
            } else {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
        } else if (!z && i2 == 1) {
            this.u0 |= 16;
        } else if (z && i2 == 0) {
            this.u0 &= -17;
        }
        if (RecyclerView.M1) {
            toString();
        }
    }

    public final boolean w() {
        return (this.u0 & 128) != 0;
    }

    public final boolean y() {
        return (this.u0 & 32) != 0;
    }
}
