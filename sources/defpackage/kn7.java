package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

/* renamed from: kn7  reason: default package */
public final class kn7 extends hdc {
    public Object X;
    public final /* synthetic */ int o = 0;

    public kn7(ida ida, List list) {
        this.X = list;
    }

    public final int j() {
        switch (this.o) {
            case 0:
                return ((List) this.X).size();
            default:
                return ((List) ((j0e) this.X).getValue()).size();
        }
    }

    public final void r(dec dec, int i) {
        switch (this.o) {
            case 0:
                jn7 jn7 = (jn7) dec;
                au1.r(((List) this.X).get(i));
                throw null;
            default:
                String str = (String) x53.j0(i, (List) ((j0e) this.X).getValue());
                View view = ((uu7) dec).a;
                ((TextView) view).setText(str);
                view.setBackgroundColor((str == null || !w9e.p0(str, "exception", true)) ? (str == null || !w9e.p0(str, "error", true)) ? 0 : ote.b0(-65536, 0.75f) : ote.b0(-65536, 0.75f));
                return;
        }
    }

    public final dec t(ViewGroup viewGroup, int i) {
        switch (this.o) {
            case 0:
                return new jn7(this, LayoutInflater.from(viewGroup.getContext()).inflate(yyb.row_chat_location, viewGroup, false));
            default:
                TextView textView = new TextView(viewGroup.getContext());
                i4f.l.b(textView, du4.b);
                float f = (float) 6;
                float f2 = (float) 3;
                textView.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
                textView.setTextColor(qp4.u0.j(textView).getText().e);
                textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return new dec(textView);
        }
    }

    public kn7(q0e q0e) {
        this.X = q0e;
    }
}
