package ru.ok.messages.views.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ContextMenuGridLayout extends hg6 {
    public final bk4 P0 = bk4.b();

    public ContextMenuGridLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
    }

    public void setupText(String str) {
        View inflate = View.inflate(getContext(), yyb.row_context_menu_action, (ViewGroup) null);
        ((ImageView) inflate.findViewById(xxb.row_options_action__iv_icon)).setVisibility(8);
        TextView textView = (TextView) inflate.findViewById(xxb.row_options_action__tv_title);
        textView.setText(str);
        textView.setTextSize(2, 14.0f);
        textView.setGravity(8388611);
        eg6 eg6 = new eg6();
        gg6 gg6 = eg6.a;
        eg6.a = new gg6(gg6.a, gg6.b, hg6.d(7, false), gg6.d);
        gg6 gg62 = eg6.b;
        eg6.b = new gg6(gg62.a, gg62.b, hg6.d(7, true), gg62.d);
        eg6.width = -1;
        eg6.height = -1;
        addView(inflate, eg6);
        Context context = getContext();
        khe khe = sme.a0;
        sme R = fm9.R(context);
        int i = this.P0.q;
        int i2 = R.M;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            ImageView imageView = (ImageView) childAt.findViewById(xxb.row_options_action__iv_icon);
            imageView.setColorFilter(R.w);
            imageView.setBackground(hm9.f(R.I, R.i, 0, i));
            ((TextView) childAt.findViewById(xxb.row_options_action__tv_title)).setTextColor(i2);
        }
    }
}
