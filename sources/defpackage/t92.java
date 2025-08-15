package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: t92  reason: default package */
public final class t92 extends ni0 {
    public final s5a a;
    public final TextView b;
    public final TextView c;
    public final s92 o;

    public t92(Context context) {
        super(context, (AttributeSet) null, 0);
        s5a s5a = new s5a(context);
        float f = (float) 71;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        layoutParams.gravity = 1;
        layoutParams.bottomMargin = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
        s5a.setLayoutParams(layoutParams);
        this.a = s5a;
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.bottomMargin = tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams2);
        textView.setTextAlignment(4);
        textView.setSingleLine(true);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        i4f.k.b(textView, du4.b);
        v3c.y(new v9(3, (Continuation) null, 3), textView);
        this.b = textView;
        TextView textView2 = new TextView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        textView2.setLayoutParams(layoutParams3);
        textView2.setGravity(17);
        i4f.s.b(textView2, du4.b);
        v3c.y(new v9(3, (Continuation) null, 2), textView2);
        this.c = textView2;
        s92 s92 = new s92(context);
        s92.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.o = s92;
        addView(s5a);
        addView(textView);
        addView(textView2);
        addView(s92);
        setGravity(1);
        setMinimumWidth(tu0.G(((float) 296) * fk4.d().getDisplayMetrics().density));
        float f2 = (float) 24;
        setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(((float) 20) * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
    }

    public final void onThemeChanged(fka fka) {
        super.onThemeChanged(fka);
        qp4.d(qp4.u0.b(getContext()), this);
    }

    public final void setDescriptions(List<? extends jqe> list) {
        s92 s92 = this.o;
        s92.getClass();
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        for (jqe d : list) {
            arrayList.add(d.d(s92));
        }
        s92.t0 = arrayList;
        s92.requestLayout();
        s92.invalidate();
        this.c.setGravity(list.isEmpty() ? 17 : 8388611);
    }

    public final void setSubtitle(jqe jqe) {
        TextView textView = this.c;
        textView.setText(jqe.d(this));
        CharSequence text = textView.getText();
        int i = 0;
        if (!(!(text == null || text.length() == 0))) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public final void setTitle(jqe jqe) {
        TextView textView = this.b;
        textView.setText(jqe.b(textView.getContext()));
    }
}
