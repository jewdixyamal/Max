package defpackage;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;

/* renamed from: qf1  reason: default package */
public final /* synthetic */ class qf1 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallOpponentsListWidget b;

    public /* synthetic */ qf1(CallOpponentsListWidget callOpponentsListWidget, int i) {
        this.a = i;
        this.b = callOpponentsListWidget;
    }

    public final Object invoke(Object obj) {
        e5f e5f = e5f.a;
        CallOpponentsListWidget callOpponentsListWidget = this.b;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                bc7[] bc7Arr = CallOpponentsListWidget.H0;
                callOpponentsListWidget.getRouter().B(callOpponentsListWidget);
                return e5f;
            case 1:
                View view2 = (View) obj;
                bc7[] bc7Arr2 = CallOpponentsListWidget.H0;
                of1 r0 = callOpponentsListWidget.r0();
                r0.getClass();
                je1.c.getClass();
                pnf.o(r0.E0, new c64(":call-admin-settings"));
                return e5f;
            case 2:
                fm fmVar = (fm) obj;
                bc7[] bc7Arr3 = CallOpponentsListWidget.H0;
                w53 w53 = new w53(fmVar.getContext());
                dm dmVar = new dm(-1, -2);
                dmVar.a = 19;
                w53.setLayoutParams(dmVar);
                w53.setTitleEnabled(false);
                Toolbar toolbar = new Toolbar(w53.getContext(), (AttributeSet) null);
                t53 t53 = new t53(-1, -2);
                t53.a = 1;
                toolbar.setLayoutParams(t53);
                toolbar.setNavigationIcon((Drawable) null);
                toolbar.u(0, 0);
                toolbar.addView(callOpponentsListWidget.q0());
                w53.addView(toolbar);
                qf1 qf1 = new qf1(callOpponentsListWidget, 3);
                LinearLayout n0 = callOpponentsListWidget.n0();
                qf1.invoke(n0);
                w53.addView(n0);
                fmVar.addView(w53);
                fmVar.addView(callOpponentsListWidget.p0());
                return e5f;
            default:
                LinearLayout linearLayout = (LinearLayout) obj;
                bc7[] bc7Arr4 = CallOpponentsListWidget.H0;
                callOpponentsListWidget.getClass();
                bc7[] bc7Arr5 = CallOpponentsListWidget.H0;
                bc7 bc7 = bc7Arr5[4];
                linearLayout.addView((TextView) callOpponentsListWidget.w0.getValue());
                bc7 bc72 = bc7Arr5[5];
                linearLayout.addView((TextView) callOpponentsListWidget.x0.getValue());
                bc7 bc73 = bc7Arr5[2];
                linearLayout.addView((o7a) callOpponentsListWidget.u0.getValue());
                TextView textView = new TextView(linearLayout.getContext());
                textView.setId(y7a.T0);
                i4f.u.b(textView, du4.b);
                textView.setTextColor(qp4.u0.p(textView).c.getText().g);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setText(b8a.A);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                float f = (float) 12;
                layoutParams.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f));
                layoutParams.setMarginEnd(tu0.G(f * fk4.d().getDisplayMetrics().density));
                layoutParams.topMargin = tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density);
                layoutParams.bottomMargin = tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
                textView.setLayoutParams(layoutParams);
                textView.setVisibility(8);
                linearLayout.addView(textView);
                RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), (AttributeSet) null);
                recyclerView.setId(y7a.Q0);
                recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
                recyclerView.setAdapter((ja) callOpponentsListWidget.E0.getValue());
                recyclerView.setItemAnimator((mdc) null);
                linearLayout.addView(recyclerView);
                bc7 bc74 = bc7Arr5[6];
                linearLayout.addView((TextView) callOpponentsListWidget.y0.getValue());
                return e5f;
        }
    }
}
