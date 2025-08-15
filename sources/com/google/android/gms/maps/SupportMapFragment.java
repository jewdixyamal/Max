package com.google.android.gms.maps;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.a;

public class SupportMapFragment extends a {
    public final moa l1 = new moa((a) this);

    public final void E0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            this.S0 = true;
            moa moa = this.l1;
            moa.Z = activity;
            moa.e();
            GoogleMapOptions b = GoogleMapOptions.b(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", b);
            moa.d(bundle, new hdg(moa, activity, bundle2, bundle));
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final void H0() {
        moa moa = this.l1;
        b9b b9b = (b9b) moa.a;
        if (b9b != null) {
            try {
                yig yig = (yig) b9b.c;
                yig.H0(yig.G0(), 6);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } else {
            moa.b(5);
        }
        this.S0 = true;
    }

    public final void K0() {
        this.S0 = true;
        moa moa = this.l1;
        moa.getClass();
        moa.d((Bundle) null, new geg(moa, 1));
    }

    public final void L0(Bundle bundle) {
        ClassLoader classLoader = SupportMapFragment.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        moa moa = this.l1;
        b9b b9b = (b9b) moa.a;
        if (b9b != null) {
            try {
                Bundle bundle2 = new Bundle();
                ngg.N(bundle, bundle2);
                yig yig = (yig) b9b.c;
                Parcel G0 = yig.G0();
                agg.b(G0, bundle2);
                Parcel R = yig.R(G0, 10);
                if (R.readInt() != 0) {
                    bundle2.readFromParcel(R);
                }
                R.recycle();
                ngg.N(bundle2, bundle);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } else {
            Bundle bundle3 = (Bundle) moa.b;
            if (bundle3 != null) {
                bundle.putAll(bundle3);
            }
        }
    }

    public final void M0() {
        this.S0 = true;
        moa moa = this.l1;
        moa.getClass();
        moa.d((Bundle) null, new geg(moa, 0));
    }

    public final void N0() {
        moa moa = this.l1;
        b9b b9b = (b9b) moa.a;
        if (b9b != null) {
            try {
                yig yig = (yig) b9b.c;
                yig.H0(yig.G0(), 16);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } else {
            moa.b(4);
        }
        this.S0 = true;
    }

    public final void onLowMemory() {
        b9b b9b = (b9b) this.l1.a;
        if (b9b != null) {
            try {
                yig yig = (yig) b9b.c;
                yig.H0(yig.G0(), 9);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }
        this.S0 = true;
    }

    public final void r0(Bundle bundle) {
        ClassLoader classLoader = SupportMapFragment.class.getClassLoader();
        if (!(bundle == null || classLoader == null)) {
            bundle.setClassLoader(classLoader);
        }
        this.S0 = true;
    }

    public final void t0(Activity activity) {
        this.S0 = true;
        moa moa = this.l1;
        moa.Z = activity;
        moa.e();
    }

    public void v0(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.v0(bundle);
            moa moa = this.l1;
            moa.getClass();
            moa.d(bundle, new qdg(moa, bundle));
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        moa moa = this.l1;
        moa.getClass();
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        moa.d(bundle, new aeg(moa, frameLayout, layoutInflater, viewGroup, bundle));
        if (((b9b) moa.a) == null) {
            ee6 ee6 = ee6.d;
            Context context = frameLayout.getContext();
            int b = ee6.b(context, fe6.a);
            String c = pdg.c(context, b);
            String b2 = pdg.b(context, b);
            LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            frameLayout.addView(linearLayout);
            TextView textView = new TextView(frameLayout.getContext());
            textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            textView.setText(c);
            linearLayout.addView(textView);
            Intent a = ee6.a(b, context, (String) null);
            if (a != null) {
                Button button = new Button(context);
                button.setId(16908313);
                button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                button.setText(b2);
                linearLayout.addView(button);
                button.setOnClickListener(new hq(context, 7, a));
            }
        }
        frameLayout.setClickable(true);
        return frameLayout;
    }

    public final void y0() {
        moa moa = this.l1;
        b9b b9b = (b9b) moa.a;
        if (b9b != null) {
            try {
                yig yig = (yig) b9b.c;
                yig.H0(yig.G0(), 8);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } else {
            moa.b(1);
        }
        this.S0 = true;
    }

    public final void z0() {
        moa moa = this.l1;
        b9b b9b = (b9b) moa.a;
        if (b9b != null) {
            try {
                yig yig = (yig) b9b.c;
                yig.H0(yig.G0(), 7);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } else {
            moa.b(2);
        }
        this.S0 = true;
    }
}
