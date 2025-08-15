package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: c17  reason: default package */
public final class c17 extends FrameLayout implements ov0 {
    public static final /* synthetic */ int v0 = 0;
    public float a = (fk4.d().getDisplayMetrics().density * 16.0f);
    public float b = (fk4.d().getDisplayMetrics().density * 6.0f);
    public long c;
    public z07 o;
    public final qv0 s0;
    public b17 t0;
    public final p44 u0;

    public c17(Context context) {
        super(context, (AttributeSet) null);
        qv0 qv0 = new qv0(getContext());
        this.s0 = qv0;
        this.u0 = new p44(300);
        qv0.setClickListener(this);
        qv0.setId(mda.L);
        addView(qv0, new ViewGroup.LayoutParams(-1, -1));
    }

    public final void a(long j, z07 z07, boolean z) {
        boolean z2;
        List list;
        float[] fArr;
        z07 z072 = z07;
        boolean z3 = z;
        this.c = j;
        this.o = z072;
        float f = this.a;
        float f2 = this.b;
        qv0 qv0 = this.s0;
        ic7 ic7 = qv0.w0;
        f fVar = new f(1, qv0, qv0.class, "bindLoading", "bindLoading(Lru/ok/tamtam/models/bots/Keyboard;)V", 0, 2);
        List list2 = z072.a;
        if (ic7 != null) {
            int size = list2.size();
            List list3 = ((z07) ic7).a;
            if (size == list3.size()) {
                int size2 = list2.size();
                int i = 0;
                z2 = false;
                while (true) {
                    if (i >= size2) {
                        break;
                    }
                    lv0 lv0 = (lv0) list2.get(i);
                    if (lv0.size() != ((lv0) list3.get(i)).size()) {
                        break;
                    }
                    int size3 = lv0.size();
                    int i2 = 0;
                    while (i2 < size3) {
                        fv0 fv0 = (fv0) lv0.get(i2);
                        fv0 fv02 = (fv0) ((lv0) list3.get(i)).get(i2);
                        int i3 = size2;
                        List list4 = list3;
                        if (fv0.s0 != fv02.s0 && fv0.equals(fv02)) {
                            fVar.invoke(z072);
                            z2 = true;
                        }
                        i2++;
                        size2 = i3;
                        list3 = list4;
                    }
                    int i4 = size2;
                    List list5 = list3;
                    i++;
                }
            }
        }
        z2 = false;
        if (!z2) {
            ic7 ic72 = qv0.w0;
            if (!(!(ic72 != null ? ((z07) ic72).a(z072) : false))) {
                qv0.invalidate();
                return;
            }
            qv0.Q0 = false;
            qv0.w0 = z072;
            qv0.R0 = z3;
            pq9 pq9 = qp4.u0;
            if (z3) {
                qv0.x0.setColor(pq9.j(qv0).a().s().b.e);
            }
            ArrayList arrayList = new ArrayList();
            int size4 = list2.size();
            int i5 = 0;
            while (i5 < size4) {
                lv0 lv02 = (lv0) list2.get(i5);
                int size5 = lv02.size();
                boolean z4 = lv02.size() == 1;
                boolean z5 = i5 == 0;
                int i6 = size5;
                int i7 = 0;
                for (int size6 = lv02.size(); i7 < size6; size6 = size6) {
                    fv0 fv03 = (fv0) lv02.get(i7);
                    boolean z6 = i7 == 0;
                    boolean z7 = i7 == lv02.size() - 1;
                    boolean z8 = i5 == list2.size() - 1;
                    if (f == -1.0f && f2 == -1.0f) {
                        list = list2;
                        fArr = null;
                    } else {
                        list = list2;
                        float[] fArr2 = {f2, f2, f2, f2};
                        if (z8) {
                            if (z6 && z7) {
                                fArr2 = new float[]{f2, f2, f, f};
                            } else if (z6) {
                                fArr2 = new float[]{f2, f2, f2, f};
                            } else if (z7) {
                                fArr2 = new float[]{f2, f2, f, f2};
                            }
                        }
                        fArr = fArr2;
                    }
                    arrayList.add(new jq0(fv03, new a20(), i6, z4, z5, z6, z7, fArr));
                    i7++;
                    i6 = -1;
                    list2 = list;
                }
                List list6 = list2;
                i5++;
            }
            qv0.v0 = arrayList;
            if (qv0.L0 == null) {
                sz6 sz6 = new sz6();
                sz6.b = new int[]{0, pq9.j(qv0).e().e.a.a};
                sz6.setCallback(qv0);
                qv0.L0 = sz6;
            }
            qv0.requestLayout();
        }
    }

    public final void setClickListener(b17 b17) {
        this.t0 = b17;
    }
}
