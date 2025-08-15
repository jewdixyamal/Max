package ru.ok.messages.views.widgets;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ok/messages/views/widgets/VideoInfoTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class VideoInfoTextView extends AppCompatTextView {
    public VideoInfoTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoInfoTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        sme sme;
        if (isInEditMode()) {
            sme = ee4.e0;
        } else {
            Context context2 = getContext();
            khe khe = sme.a0;
            sme = fm9.R(context2);
        }
        setTextColor(sme.t);
        setTextSize(0, (float) getContext().getResources().getDimensionPixelSize(fpc.c));
        float f = (float) 4;
        float f2 = (float) 2;
        setPadding(tu0.G(getContext().getResources().getDisplayMetrics().density * f), tu0.G(getContext().getResources().getDisplayMetrics().density * f2), tu0.G(getContext().getResources().getDisplayMetrics().density * f), tu0.G(f2 * getContext().getResources().getDisplayMetrics().density));
        setIncludeFontPadding(false);
        setCompoundDrawablePadding(tu0.G(f * getContext().getResources().getDisplayMetrics().density));
        setGravity(8388627);
        setBackground(hm9.b0(Integer.valueOf(sme.r), (Integer) null, (Integer) null, tu0.G(((float) 16) * getContext().getResources().getDisplayMetrics().density)));
    }
}
