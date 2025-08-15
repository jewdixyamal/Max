package ru.ok.messages.media.crop;

import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import one.me.image.crop.view.ImageCropView;
import ru.ok.messages.views.fragments.base.FrgBase;
import ru.ok.tamtam.android.prefs.PmsKey;

public class FrgTamCropImage extends FrgBase {
    public ImageCropView B1;
    public ImageButton C1;
    public ImageButton D1;
    public ImageButton E1;
    public ImageButton F1;
    public TextView G1;

    public final void L0(Bundle bundle) {
        super.L0(bundle);
        bundle.putParcelable("ru.ok.tamtam.extra.CROP_STATE", this.B1.getCropState());
    }

    public final void O0(View view, Bundle bundle) {
        ImageCropView imageCropView = (ImageCropView) view.findViewById(xxb.frg_tam_crop_image__iv_crop);
        this.B1 = imageCropView;
        imageCropView.setFreestyleCropMode(1);
        this.B1.setRotateEnabled(false);
        this.B1.setMaxScaleMultiplier(4.0f);
        ImageCropView imageCropView2 = this.B1;
        z7d z7d = ((y8a) ((ed3) this.p1.b)).n().b;
        z7d.getClass();
        imageCropView2.setMinImageSize((float) ((int) z7d.q(PmsKey.f84minimagesidesize, (long) 64)));
        this.C1 = (ImageButton) view.findViewById(xxb.frg_tam_crop_image__rotate);
        this.D1 = (ImageButton) view.findViewById(xxb.frg_tam_crop_image__flip);
        this.G1 = (TextView) view.findViewById(xxb.frg_tam_crop_image__btn_clear);
        this.E1 = (ImageButton) view.findViewById(xxb.frg_tam_crop_image__btn_done);
        this.F1 = (ImageButton) view.findViewById(xxb.frg_tam_crop_image__btn_close);
        Uri uri = (Uri) this.Z.getParcelable("ru.ok.tamtam.extra.SOURCE_URI");
        Uri uri2 = (Uri) this.Z.getParcelable("ru.ok.tamtam.extra.RESULT_URI");
        hm9.m("ru.ok.messages.media.crop.FrgTamCropImage", "onViewCreated:\nsourceUri: %s\nresultUri: %s", uri.toString(), uri2.toString());
        nz3 nz3 = bundle != null ? (nz3) bundle.getParcelable("ru.ok.tamtam.extra.CROP_STATE") : this.Z.containsKey("ru.ok.tamtam.extra.CROP_STATE") ? (nz3) this.Z.getParcelable("ru.ok.tamtam.extra.CROP_STATE") : null;
        try {
            wa6 wa6 = this.B1.a;
            int maxBitmapSize = wa6.getMaxBitmapSize();
            new zn0(wa6.getContext(), uri, uri2, maxBitmapSize, maxBitmapSize, new qqd(28, (Object) wa6)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            wa6.H0 = nz3;
        } catch (Exception e) {
            hm9.p("ru.ok.messages.media.crop.FrgTamCropImage", "fail to setImageUri", e);
            q5 g1 = g1();
            if (g1 != null) {
                g1.setResult(0);
                int i = jpc.E;
                Handler handler = a14.i;
                a14.N(0, g1, g1.getString(i));
                e1();
            }
        }
        nd7.h(this.C1, new c56(this, 0));
        nd7.h(this.D1, new c56(this, 1));
        nd7.h(this.G1, new c56(this, 2));
        nd7.h(this.F1, new c56(this, 3));
        nd7.h(this.E1, new c56(this, 4));
        this.C1.setBackground(this.r1.a());
        this.D1.setBackground(this.r1.a());
        this.G1.setBackground(hm9.L(0, this.r1.i));
        this.E1.setBackground(this.r1.a());
        this.F1.setBackground(this.r1.a());
        this.C1.setColorFilter(this.r1.w);
        this.D1.setColorFilter(this.r1.w);
        this.E1.setColorFilter(this.r1.k);
        this.F1.setColorFilter(this.r1.w);
        TextView textView = this.G1;
        sme sme = this.r1;
        textView.setTextColor(new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{sme.M, sme.w}));
    }

    public final String f1() {
        return "CROP_IMAGE";
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(yyb.frg_tam_crop_image, viewGroup, false);
    }
}
