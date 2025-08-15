package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: qf8  reason: default package */
public final class qf8 extends fn {
    public final eh8 Y = eh8.d(getContext());
    public final mf8 Z = new mf8(this, 1);
    public TextView s0;
    public wg8 t0 = wg8.c;
    public ArrayList u0;
    public pf8 v0;
    public ListView w0;
    public boolean x0;
    public long y0;
    public final cy z0 = new cy(8, (Object) this);

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qf8(android.content.Context r2) {
        /*
            r1 = this;
            r0 = 0
            android.view.ContextThemeWrapper r2 = defpackage.lh8.a(r2, r0)
            int r0 = defpackage.lh8.b(r2)
            r1.<init>(r2, r0)
            wg8 r2 = defpackage.wg8.c
            r1.t0 = r2
            cy r2 = new cy
            r0 = 8
            r2.<init>((int) r0, (java.lang.Object) r1)
            r1.z0 = r2
            android.content.Context r2 = r1.getContext()
            eh8 r2 = defpackage.eh8.d(r2)
            r1.Y = r2
            mf8 r2 = new mf8
            r0 = 1
            r2.<init>(r1, r0)
            r1.Z = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qf8.<init>(android.content.Context):void");
    }

    public final void g() {
        if (this.x0) {
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
            Collections.sort(arrayList, fs4.c);
            if (SystemClock.uptimeMillis() - this.y0 >= 300) {
                this.y0 = SystemClock.uptimeMillis();
                this.u0.clear();
                this.u0.addAll(arrayList);
                this.v0.notifyDataSetChanged();
                return;
            }
            cy cyVar = this.z0;
            cyVar.removeMessages(1);
            cyVar.sendMessageAtTime(cyVar.obtainMessage(1, arrayList), this.y0 + 300);
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
        setContentView(syb.mr_chooser_dialog);
        this.u0 = new ArrayList();
        this.v0 = new pf8(getContext(), this.u0);
        ListView listView = (ListView) findViewById(dvb.mr_chooser_list);
        this.w0 = listView;
        listView.setAdapter(this.v0);
        this.w0.setOnItemClickListener(this.v0);
        this.w0.setEmptyView(findViewById(16908292));
        this.s0 = (TextView) findViewById(dvb.mr_chooser_title);
        getWindow().setLayout(dy7.v(getContext()), -2);
    }

    public final void onDetachedFromWindow() {
        this.x0 = false;
        this.Y.f(this.Z);
        this.z0.removeMessages(1);
        super.onDetachedFromWindow();
    }

    public final void setTitle(CharSequence charSequence) {
        this.s0.setText(charSequence);
    }

    public final void setTitle(int i) {
        this.s0.setText(i);
    }
}
