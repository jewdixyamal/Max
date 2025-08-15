package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* renamed from: pg8  reason: default package */
public final class pg8 extends fn {
    public static final /* synthetic */ int e1 = 0;
    public boolean A0;
    public long B0;
    public final cy C0 = new cy(10, (Object) this);
    public RecyclerView D0;
    public ng8 E0;
    public og8 F0;
    public HashMap G0;
    public dh8 H0;
    public HashMap I0;
    public boolean J0;
    public boolean K0;
    public boolean L0;
    public ImageButton M0;
    public Button N0;
    public ImageView O0;
    public View P0;
    public ImageView Q0;
    public TextView R0;
    public TextView S0;
    public String T0;
    public MediaControllerCompat U0;
    public final jg8 V0;
    public MediaDescriptionCompat W0;
    public ig8 X0;
    public final eh8 Y;
    public Bitmap Y0;
    public final mf8 Z;
    public Uri Z0;
    public boolean a1;
    public Bitmap b1;
    public int c1;
    public final boolean d1;
    public wg8 s0 = wg8.c;
    public dh8 t0;
    public final ArrayList u0 = new ArrayList();
    public final ArrayList v0 = new ArrayList();
    public final ArrayList w0 = new ArrayList();
    public final ArrayList x0 = new ArrayList();
    public final Context y0;
    public boolean z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public pg8(android.content.Context r3) {
        /*
            r2 = this;
            r0 = 0
            android.view.ContextThemeWrapper r3 = defpackage.lh8.a(r3, r0)
            int r1 = defpackage.lh8.b(r3)
            r2.<init>(r3, r1)
            wg8 r3 = defpackage.wg8.c
            r2.s0 = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.u0 = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.v0 = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.w0 = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.x0 = r3
            cy r3 = new cy
            r1 = 10
            r3.<init>((int) r1, (java.lang.Object) r2)
            r2.C0 = r3
            android.content.Context r3 = r2.getContext()
            r2.y0 = r3
            eh8 r3 = defpackage.eh8.d(r3)
            r2.Y = r3
            ah8 r3 = defpackage.eh8.d
            if (r3 != 0) goto L_0x0046
            goto L_0x004e
        L_0x0046:
            ah8 r3 = defpackage.eh8.c()
            r3.getClass()
            r0 = 1
        L_0x004e:
            r2.d1 = r0
            mf8 r3 = new mf8
            r0 = 4
            r3.<init>(r2, r0)
            r2.Z = r3
            defpackage.eh8.b()
            ah8 r3 = defpackage.eh8.c()
            dh8 r3 = r3.f()
            r2.t0 = r3
            jg8 r3 = new jg8
            r3.<init>(r2)
            r2.V0 = r3
            r2.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pg8.<init>(android.content.Context):void");
    }

    public final void g(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            dh8 dh8 = (dh8) list.get(size);
            if (dh8.d() || !dh8.g || !dh8.h(this.s0) || this.t0 == dh8) {
                list.remove(size);
            }
        }
    }

    public final void h() {
        MediaDescriptionCompat mediaDescriptionCompat = this.W0;
        Uri uri = null;
        Bitmap iconBitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getIconBitmap();
        MediaDescriptionCompat mediaDescriptionCompat2 = this.W0;
        if (mediaDescriptionCompat2 != null) {
            uri = mediaDescriptionCompat2.getIconUri();
        }
        ig8 ig8 = this.X0;
        Bitmap bitmap = ig8 == null ? this.Y0 : ig8.a;
        Uri uri2 = ig8 == null ? this.Z0 : ig8.b;
        if (bitmap != iconBitmap || (bitmap == null && !Objects.equals(uri2, uri))) {
            ig8 ig82 = this.X0;
            if (ig82 != null) {
                ig82.cancel(true);
            }
            ig8 ig83 = new ig8(this);
            this.X0 = ig83;
            ig83.execute(new Void[0]);
        }
    }

    public final void i() {
        MediaControllerCompat mediaControllerCompat = this.U0;
        jg8 jg8 = this.V0;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.unregisterCallback(jg8);
            this.U0 = null;
        }
    }

    public final void j(wg8 wg8) {
        if (wg8 == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (!this.s0.equals(wg8)) {
            this.s0 = wg8;
            if (this.A0) {
                eh8 eh8 = this.Y;
                mf8 mf8 = this.Z;
                eh8.f(mf8);
                eh8.a(wg8, mf8, 1);
                m();
            }
        }
    }

    public final void k() {
        Context context = this.y0;
        int i = -1;
        int v = !context.getResources().getBoolean(wsb.is_tablet) ? -1 : dy7.v(context);
        if (context.getResources().getBoolean(wsb.is_tablet)) {
            i = -2;
        }
        getWindow().setLayout(v, i);
        this.Y0 = null;
        this.Z0 = null;
        h();
        l();
        n();
    }

    public final void l() {
        Bitmap bitmap;
        if ((this.H0 != null || this.J0) ? true : !this.z0) {
            this.L0 = true;
            return;
        }
        this.L0 = false;
        if (!this.t0.g() || this.t0.d()) {
            dismiss();
        }
        CharSequence charSequence = null;
        if (!this.a1 || (((bitmap = this.b1) != null && bitmap.isRecycled()) || this.b1 == null)) {
            Bitmap bitmap2 = this.b1;
            if (bitmap2 != null && bitmap2.isRecycled()) {
                Objects.toString(this.b1);
            }
            this.Q0.setVisibility(8);
            this.P0.setVisibility(8);
            this.O0.setImageBitmap((Bitmap) null);
        } else {
            this.Q0.setVisibility(0);
            this.Q0.setImageBitmap(this.b1);
            this.Q0.setBackgroundColor(this.c1);
            this.P0.setVisibility(0);
            Bitmap bitmap3 = this.b1;
            RenderScript create = RenderScript.create(this.y0);
            Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap3);
            Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            create2.setRadius(10.0f);
            create2.setInput(createFromBitmap);
            create2.forEach(createTyped);
            Bitmap copy = bitmap3.copy(bitmap3.getConfig(), true);
            createTyped.copyTo(copy);
            createFromBitmap.destroy();
            createTyped.destroy();
            create2.destroy();
            create.destroy();
            this.O0.setImageBitmap(copy);
        }
        this.a1 = false;
        this.b1 = null;
        this.c1 = 0;
        MediaDescriptionCompat mediaDescriptionCompat = this.W0;
        CharSequence title = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getTitle();
        boolean z = !TextUtils.isEmpty(title);
        MediaDescriptionCompat mediaDescriptionCompat2 = this.W0;
        if (mediaDescriptionCompat2 != null) {
            charSequence = mediaDescriptionCompat2.getSubtitle();
        }
        boolean isEmpty = true ^ TextUtils.isEmpty(charSequence);
        if (z) {
            this.R0.setText(title);
        } else {
            this.R0.setText(this.T0);
        }
        if (isEmpty) {
            this.S0.setText(charSequence);
            this.S0.setVisibility(0);
            return;
        }
        this.S0.setVisibility(8);
    }

    public final void m() {
        ArrayList arrayList = this.u0;
        arrayList.clear();
        ArrayList arrayList2 = this.v0;
        arrayList2.clear();
        ArrayList arrayList3 = this.w0;
        arrayList3.clear();
        arrayList.addAll(Collections.unmodifiableList(this.t0.u));
        ch8 ch8 = this.t0.a;
        ch8.getClass();
        eh8.b();
        for (dh8 dh8 : Collections.unmodifiableList(ch8.b)) {
            gaa b = this.t0.b(dh8);
            if (b != null) {
                if (b.B()) {
                    arrayList2.add(dh8);
                }
                rg8 rg8 = (rg8) b.a;
                if (rg8 != null && rg8.e) {
                    arrayList3.add(dh8);
                }
            }
        }
        g(arrayList2);
        g(arrayList3);
        fs4 fs4 = fs4.X;
        Collections.sort(arrayList, fs4);
        Collections.sort(arrayList2, fs4);
        Collections.sort(arrayList3, fs4);
        this.E0.F();
    }

    public final void n() {
        if (!this.A0) {
            return;
        }
        if (SystemClock.uptimeMillis() - this.B0 >= 300) {
            if ((this.H0 != null || this.J0) ? true : !this.z0) {
                this.K0 = true;
                return;
            }
            this.K0 = false;
            if (!this.t0.g() || this.t0.d()) {
                dismiss();
            }
            this.B0 = SystemClock.uptimeMillis();
            this.E0.E();
            return;
        }
        cy cyVar = this.C0;
        cyVar.removeMessages(1);
        cyVar.sendEmptyMessageAtTime(1, this.B0 + 300);
    }

    public final void o() {
        if (this.K0) {
            n();
        }
        if (this.L0) {
            l();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0 = true;
        this.Y.a(this.s0, this.Z, 1);
        m();
        boolean z = eh8.c;
        i();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(syb.mr_cast_dialog);
        Context context = this.y0;
        int i = lh8.a;
        getWindow().getDecorView().setBackgroundColor(lt3.a(context, lh8.i(context) ? dtb.mr_dynamic_dialog_background_light : dtb.mr_dynamic_dialog_background_dark));
        ImageButton imageButton = (ImageButton) findViewById(dvb.mr_cast_close_button);
        this.M0 = imageButton;
        imageButton.setColorFilter(-1);
        this.M0.setOnClickListener(new hg8(this, 0));
        Button button = (Button) findViewById(dvb.mr_cast_stop_button);
        this.N0 = button;
        button.setTextColor(-1);
        this.N0.setOnClickListener(new hg8(this, 1));
        this.E0 = new ng8(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(dvb.mr_cast_list);
        this.D0 = recyclerView;
        recyclerView.setAdapter(this.E0);
        this.D0.setLayoutManager(new LinearLayoutManager());
        this.F0 = new og8(this, 0);
        this.G0 = new HashMap();
        this.I0 = new HashMap();
        this.O0 = (ImageView) findViewById(dvb.mr_cast_meta_background);
        this.P0 = findViewById(dvb.mr_cast_meta_black_scrim);
        this.Q0 = (ImageView) findViewById(dvb.mr_cast_meta_art);
        TextView textView = (TextView) findViewById(dvb.mr_cast_meta_title);
        this.R0 = textView;
        textView.setTextColor(-1);
        TextView textView2 = (TextView) findViewById(dvb.mr_cast_meta_subtitle);
        this.S0 = textView2;
        textView2.setTextColor(-1);
        this.T0 = context.getResources().getString(n1c.mr_cast_dialog_title_view_placeholder);
        this.z0 = true;
        k();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0 = false;
        this.Y.f(this.Z);
        this.C0.removeCallbacksAndMessages((Object) null);
        i();
    }
}
