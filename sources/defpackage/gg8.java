package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.widget.ImageButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: gg8  reason: default package */
public final class gg8 extends fn {
    public long A0;
    public final cy B0 = new cy(9, (Object) this);
    public final eh8 Y;
    public final mf8 Z;
    public final Context s0;
    public wg8 t0 = wg8.c;
    public ArrayList u0;
    public fg8 v0;
    public RecyclerView w0;
    public boolean x0;
    public dh8 y0;
    public final long z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public gg8(android.content.Context r3) {
        /*
            r2 = this;
            r0 = 0
            android.view.ContextThemeWrapper r3 = defpackage.lh8.a(r3, r0)
            int r0 = defpackage.lh8.b(r3)
            r2.<init>(r3, r0)
            wg8 r3 = defpackage.wg8.c
            r2.t0 = r3
            cy r3 = new cy
            r0 = 9
            r3.<init>((int) r0, (java.lang.Object) r2)
            r2.B0 = r3
            android.content.Context r3 = r2.getContext()
            eh8 r0 = defpackage.eh8.d(r3)
            r2.Y = r0
            mf8 r0 = new mf8
            r1 = 3
            r0.<init>(r2, r1)
            r2.Z = r0
            r2.s0 = r3
            android.content.res.Resources r3 = r3.getResources()
            int r0 = defpackage.iyb.mr_update_routes_delay_ms
            int r3 = r3.getInteger(r0)
            long r0 = (long) r3
            r2.z0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gg8.<init>(android.content.Context):void");
    }

    public final void g() {
        if (this.y0 == null && this.x0) {
            this.Y.getClass();
            eh8.b();
            ah8 c = eh8.c();
            ArrayList arrayList = new ArrayList(c == null ? Collections.emptyList() : c.g);
            int size = arrayList.size();
            while (true) {
                int i = size - 1;
                if (size <= 0) {
                    break;
                }
                dh8 dh8 = (dh8) arrayList.get(i);
                if (dh8.d() || !dh8.g || !dh8.h(this.t0)) {
                    arrayList.remove(i);
                }
                size = i;
            }
            Collections.sort(arrayList, fs4.o);
            long uptimeMillis = SystemClock.uptimeMillis() - this.A0;
            long j = this.z0;
            if (uptimeMillis >= j) {
                this.A0 = SystemClock.uptimeMillis();
                this.u0.clear();
                this.u0.addAll(arrayList);
                this.v0.C();
                return;
            }
            cy cyVar = this.B0;
            cyVar.removeMessages(1);
            cyVar.sendMessageAtTime(cyVar.obtainMessage(1, arrayList), this.A0 + j);
        }
    }

    public final void h(wg8 wg8) {
        if (wg8 == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (!this.t0.equals(wg8)) {
            this.t0 = wg8;
            if (this.x0) {
                eh8 eh8 = this.Y;
                mf8 mf8 = this.Z;
                eh8.f(mf8);
                eh8.a(wg8, mf8, 1);
            }
            g();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.x0 = true;
        this.Y.a(this.t0, this.Z, 1);
        g();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(syb.mr_picker_dialog);
        Context context = this.s0;
        int i = lh8.a;
        getWindow().getDecorView().setBackgroundColor(lt3.a(context, lh8.i(context) ? dtb.mr_dynamic_dialog_background_light : dtb.mr_dynamic_dialog_background_dark));
        this.u0 = new ArrayList();
        ((ImageButton) findViewById(dvb.mr_picker_close_button)).setOnClickListener(new e0d(6, this));
        this.v0 = new fg8(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(dvb.mr_picker_list);
        this.w0 = recyclerView;
        recyclerView.setAdapter(this.v0);
        this.w0.setLayoutManager(new LinearLayoutManager());
        int i2 = -1;
        int v = !context.getResources().getBoolean(wsb.is_tablet) ? -1 : dy7.v(context);
        if (context.getResources().getBoolean(wsb.is_tablet)) {
            i2 = -2;
        }
        getWindow().setLayout(v, i2);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.x0 = false;
        this.Y.f(this.Z);
        this.B0.removeMessages(1);
    }
}
