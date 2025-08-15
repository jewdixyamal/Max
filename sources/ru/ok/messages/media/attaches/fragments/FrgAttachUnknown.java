package ru.ok.messages.media.attaches.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import ru.ok.messages.views.widgets.BlockedAttachView;
import ru.ok.messages.views.widgets.SlideOutLayout;

public class FrgAttachUnknown extends FrgAttachView {
    public final boolean G0(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332 || g1() == null) {
            return true;
        }
        b0().finish();
        return true;
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SlideOutLayout slideOutLayout = (SlideOutLayout) layoutInflater.inflate(yyb.frg_unknown_attach_view, viewGroup, false);
        z1();
        BlockedAttachView blockedAttachView = (BlockedAttachView) slideOutLayout.findViewById(xxb.frg_unknown_attach__deleted_view);
        blockedAttachView.a.setText(this.Z.getString("ru.ok.tamtam.extra.TEXT"));
        blockedAttachView.setBackgroundColor(-16777216);
        nd7.h(blockedAttachView, new e5(8, this));
        slideOutLayout.setSlideOutListener(this);
        Y0(true);
        ai3 v1 = v1();
        if (v1 != null) {
            v1.h();
        }
        A1(slideOutLayout, blockedAttachView);
        return slideOutLayout;
    }

    public final void y1(boolean z) {
    }
}
