package defpackage;

import android.media.MediaDescription;
import android.net.Uri;

/* renamed from: ia8  reason: default package */
public abstract class ia8 {
    public static Uri a(MediaDescription mediaDescription) {
        return mediaDescription.getMediaUri();
    }

    public static void b(MediaDescription.Builder builder, Uri uri) {
        builder.setMediaUri(uri);
    }
}
