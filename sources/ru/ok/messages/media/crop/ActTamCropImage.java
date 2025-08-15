package ru.ok.messages.media.crop;

import android.net.Uri;
import android.os.Bundle;

public class ActTamCropImage extends q5 {
    public cl8 U0;

    public final String Z() {
        return null;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(yyb.act_tam_crop_image);
        f0(this.U0.L);
        findViewById(xxb.act_tam_crop_image__root).setBackgroundColor(u().m);
        if (bundle == null) {
            boolean booleanExtra = getIntent().getBooleanExtra("ru.ok.tamtam.extra.SAVE_AS_PNG", false);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("ru.ok.tamtam.extra.SOURCE_URI", (Uri) getIntent().getParcelableExtra("ru.ok.tamtam.extra.SOURCE_URI"));
            bundle2.putParcelable("ru.ok.tamtam.extra.RESULT_URI", (Uri) getIntent().getParcelableExtra("ru.ok.tamtam.extra.RESULT_URI"));
            bundle2.putParcelable("ru.ok.tamtam.extra.CROP_STATE", (nz3) getIntent().getParcelableExtra("ru.ok.tamtam.extra.CROP_STATE"));
            bundle2.putBoolean("ru.ok.tamtam.extra.SAVE_AS_PNG", booleanExtra);
            FrgTamCropImage frgTamCropImage = new FrgTamCropImage();
            frgTamCropImage.X0(bundle2);
            dy7.e(S(), xxb.act_tam_crop_image__container, frgTamCropImage, "ru.ok.messages.media.crop.FrgTamCropImage");
        }
    }

    public final sme u() {
        if (this.U0 == null) {
            this.U0 = cl8.e0;
        }
        return this.U0;
    }
}
