package defpackage;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: sh8  reason: default package */
public final class sh8 extends MediaSession.Callback {
    public final /* synthetic */ t68 a;

    public sh8(t68 t68) {
        this.a = t68;
    }

    public final vh8 a() {
        vh8 vh8;
        synchronized (this.a.a) {
            vh8 = (vh8) ((WeakReference) this.a.c).get();
        }
        if (vh8 == null || this.a != vh8.getCallback()) {
            return null;
        }
        return vh8;
    }

    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        lcf lcf;
        vh8 a2 = a();
        if (a2 != null) {
            bi8.a(bundle);
            try {
                if (str.equals(MediaControllerCompat.COMMAND_GET_EXTRA_BINDER)) {
                    if (resultReceiver != null) {
                        Bundle bundle2 = new Bundle();
                        ai8 ai8 = a2.c;
                        pr6 a3 = ai8.a();
                        bundle2.putBinder(MediaSessionCompat.KEY_EXTRA_BINDER, a3 == null ? null : a3.asBinder());
                        synchronized (ai8.a) {
                            lcf = ai8.o;
                        }
                        tpa.E(bundle2, lcf);
                        resultReceiver.send(0, bundle2);
                    }
                } else if (str.equals(MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM)) {
                    if (bundle != null) {
                        this.a.f((ja8) mf7.a(bundle.getParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION), ja8.CREATOR));
                    }
                } else if (str.equals(MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM_AT)) {
                    if (bundle != null) {
                        this.a.g((ja8) mf7.a(bundle.getParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION), ja8.CREATOR), bundle.getInt(MediaControllerCompat.COMMAND_ARGUMENT_INDEX));
                    }
                } else if (str.equals(MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM)) {
                    if (bundle != null) {
                        this.a.u((ja8) mf7.a(bundle.getParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION), ja8.CREATOR));
                    }
                } else if (str.equals(MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM_AT)) {
                    List list = a2.h;
                    if (!(list == null || bundle == null)) {
                        int i = bundle.getInt(MediaControllerCompat.COMMAND_ARGUMENT_INDEX, -1);
                        yh8 yh8 = (i < 0 || i >= list.size()) ? null : (yh8) list.get(i);
                        if (yh8 != null) {
                            this.a.u(yh8.a);
                        }
                    }
                } else {
                    this.a.h(str, bundle, resultReceiver);
                }
            } catch (BadParcelableException unused) {
            }
            a2.a((vi8) null);
        }
    }

    public final void onCustomAction(String str, Bundle bundle) {
        vh8 a2 = a();
        if (a2 != null) {
            bi8.a(bundle);
            try {
                boolean equals = str.equals(MediaSessionCompat.ACTION_PLAY_FROM_URI);
                t68 t68 = this.a;
                if (equals) {
                    if (bundle != null) {
                        Bundle bundle2 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);
                        bi8.a(bundle2);
                        t68.p((Uri) bundle.getParcelable(MediaSessionCompat.ACTION_ARGUMENT_URI), bundle2);
                    }
                } else if (str.equals(MediaSessionCompat.ACTION_PREPARE)) {
                    t68.q();
                } else if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_MEDIA_ID)) {
                    if (bundle != null) {
                        String string = bundle.getString(MediaSessionCompat.ACTION_ARGUMENT_MEDIA_ID);
                        Bundle bundle3 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);
                        bi8.a(bundle3);
                        t68.r(string, bundle3);
                    }
                } else if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_SEARCH)) {
                    if (bundle != null) {
                        String string2 = bundle.getString(MediaSessionCompat.ACTION_ARGUMENT_QUERY);
                        Bundle bundle4 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);
                        bi8.a(bundle4);
                        t68.s(string2, bundle4);
                    }
                } else if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_URI)) {
                    if (bundle != null) {
                        Bundle bundle5 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);
                        bi8.a(bundle5);
                        t68.t((Uri) bundle.getParcelable(MediaSessionCompat.ACTION_ARGUMENT_URI), bundle5);
                    }
                } else if (str.equals(MediaSessionCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                    if (bundle != null) {
                        bundle.getBoolean(MediaSessionCompat.ACTION_ARGUMENT_CAPTIONING_ENABLED);
                        t68.getClass();
                    }
                } else if (str.equals(MediaSessionCompat.ACTION_SET_REPEAT_MODE)) {
                    if (bundle != null) {
                        t68.A(bundle.getInt(MediaSessionCompat.ACTION_ARGUMENT_REPEAT_MODE));
                    }
                } else if (str.equals(MediaSessionCompat.ACTION_SET_SHUFFLE_MODE)) {
                    if (bundle != null) {
                        t68.B(bundle.getInt(MediaSessionCompat.ACTION_ARGUMENT_SHUFFLE_MODE));
                    }
                } else if (str.equals(MediaSessionCompat.ACTION_SET_RATING)) {
                    if (bundle != null) {
                        bi8.a(bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS));
                        t68.z((h5c) mf7.a(bundle.getParcelable(MediaSessionCompat.ACTION_ARGUMENT_RATING), h5c.CREATOR));
                    }
                } else if (!str.equals(MediaSessionCompat.ACTION_SET_PLAYBACK_SPEED)) {
                    t68.i(str, bundle);
                } else if (bundle != null) {
                    t68.x(bundle.getFloat(MediaSessionCompat.ACTION_ARGUMENT_PLAYBACK_SPEED, 1.0f));
                }
            } catch (BadParcelableException unused) {
            }
            a2.a((vi8) null);
        }
    }

    public final void onFastForward() {
        vh8 a2 = a();
        if (a2 != null) {
            this.a.j();
            a2.a((vi8) null);
        }
    }

    public final boolean onMediaButtonEvent(Intent intent) {
        vh8 a2 = a();
        if (a2 == null) {
            return false;
        }
        boolean k = this.a.k(intent);
        a2.a((vi8) null);
        return k || super.onMediaButtonEvent(intent);
    }

    public final void onPause() {
        vh8 a2 = a();
        if (a2 != null) {
            this.a.l();
            a2.a((vi8) null);
        }
    }

    public final void onPlay() {
        vh8 a2 = a();
        if (a2 != null) {
            this.a.m();
            a2.a((vi8) null);
        }
    }

    public final void onPlayFromMediaId(String str, Bundle bundle) {
        vh8 a2 = a();
        if (a2 != null) {
            bi8.a(bundle);
            this.a.n(str, bundle);
            a2.a((vi8) null);
        }
    }

    public final void onPlayFromSearch(String str, Bundle bundle) {
        vh8 a2 = a();
        if (a2 != null) {
            bi8.a(bundle);
            this.a.o(str, bundle);
            a2.a((vi8) null);
        }
    }

    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        vh8 a2 = a();
        if (a2 != null) {
            bi8.a(bundle);
            this.a.p(uri, bundle);
            a2.a((vi8) null);
        }
    }

    public final void onPrepare() {
        vh8 a2 = a();
        if (a2 != null) {
            this.a.q();
            a2.a((vi8) null);
        }
    }

    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        vh8 a2 = a();
        if (a2 != null) {
            bi8.a(bundle);
            this.a.r(str, bundle);
            a2.a((vi8) null);
        }
    }

    public final void onPrepareFromSearch(String str, Bundle bundle) {
        vh8 a2 = a();
        if (a2 != null) {
            bi8.a(bundle);
            this.a.s(str, bundle);
            a2.a((vi8) null);
        }
    }

    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        vh8 a2 = a();
        if (a2 != null) {
            bi8.a(bundle);
            this.a.t(uri, bundle);
            a2.a((vi8) null);
        }
    }

    public final void onRewind() {
        vh8 a2 = a();
        if (a2 != null) {
            this.a.v();
            a2.a((vi8) null);
        }
    }

    public final void onSeekTo(long j) {
        vh8 a2 = a();
        if (a2 != null) {
            this.a.w(j);
            a2.a((vi8) null);
        }
    }

    public final void onSetPlaybackSpeed(float f) {
        vh8 a2 = a();
        if (a2 != null) {
            this.a.x(f);
            a2.a((vi8) null);
        }
    }

    public final void onSetRating(Rating rating) {
        vh8 a2 = a();
        if (a2 != null) {
            this.a.y(h5c.a(rating));
            a2.a((vi8) null);
        }
    }

    public final void onSkipToNext() {
        vh8 a2 = a();
        if (a2 != null) {
            this.a.C();
            a2.a((vi8) null);
        }
    }

    public final void onSkipToPrevious() {
        vh8 a2 = a();
        if (a2 != null) {
            this.a.D();
            a2.a((vi8) null);
        }
    }

    public final void onSkipToQueueItem(long j) {
        vh8 a2 = a();
        if (a2 != null) {
            this.a.E(j);
            a2.a((vi8) null);
        }
    }

    public final void onStop() {
        vh8 a2 = a();
        if (a2 != null) {
            this.a.F();
            a2.a((vi8) null);
        }
    }
}
