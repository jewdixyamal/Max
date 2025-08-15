package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.datepicker.c;
import java.util.Calendar;

/* renamed from: g18  reason: default package */
public final class g18 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;
    public final /* synthetic */ MaterialCalendar c;

    public /* synthetic */ g18(MaterialCalendar materialCalendar, c cVar, int i) {
        this.a = i;
        this.c = materialCalendar;
        this.b = cVar;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                MaterialCalendar materialCalendar = this.c;
                int Y0 = ((LinearLayoutManager) materialCalendar.s1.getLayoutManager()).Y0() - 1;
                if (Y0 >= 0) {
                    Calendar b2 = jaf.b(this.b.o.a.a);
                    b2.add(2, Y0);
                    materialCalendar.e1(new kc9(b2));
                    return;
                }
                return;
            default:
                MaterialCalendar materialCalendar2 = this.c;
                int W0 = ((LinearLayoutManager) materialCalendar2.s1.getLayoutManager()).W0() + 1;
                if (W0 < materialCalendar2.s1.getAdapter().j()) {
                    Calendar b3 = jaf.b(this.b.o.a.a);
                    b3.add(2, W0);
                    materialCalendar2.e1(new kc9(b3));
                    return;
                }
                return;
        }
    }
}
