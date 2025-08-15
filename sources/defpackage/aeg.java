package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: aeg  reason: default package */
public final class aeg implements neg {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ LayoutInflater b;
    public final /* synthetic */ ViewGroup c;
    public final /* synthetic */ Bundle d;
    public final /* synthetic */ moa e;

    public aeg(moa moa, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.e = moa;
        this.a = frameLayout;
        this.b = layoutInflater;
        this.c = viewGroup;
        this.d = bundle;
    }

    public final int a() {
        return 2;
    }

    public final void b() {
        StrictMode.ThreadPolicy threadPolicy;
        FrameLayout frameLayout = this.a;
        frameLayout.removeAllViews();
        b9b b9b = (b9b) this.e.a;
        LayoutInflater layoutInflater = this.b;
        ViewGroup viewGroup = this.c;
        Bundle bundle = this.d;
        b9b.getClass();
        try {
            Bundle bundle2 = new Bundle();
            ngg.N(bundle, bundle2);
            threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
            yig yig = (yig) b9b.c;
            oy9 oy9 = new oy9(layoutInflater);
            oy9 oy92 = new oy9(viewGroup);
            Parcel G0 = yig.G0();
            agg.c(G0, oy9);
            agg.c(G0, oy92);
            agg.b(G0, bundle2);
            Parcel R = yig.R(G0, 4);
            xr6 K0 = oy9.K0(R.readStrongBinder());
            R.recycle();
            StrictMode.setThreadPolicy(threadPolicy);
            ngg.N(bundle2, bundle);
            frameLayout.addView((View) oy9.L0(K0));
        } catch (RemoteException e2) {
            throw new RuntimeException(e2);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }
}
