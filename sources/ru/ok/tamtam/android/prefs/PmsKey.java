package ru.ok.tamtam.android.prefs;

import androidx.annotation.Keep;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0015\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0003\b\u0001\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\bj\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b\u0001j\u0003\b \u0001j\u0003\b¡\u0001¨\u0006¢\u0001"}, d2 = {"Lru/ok/tamtam/android/prefs/PmsKey;", "", "<init>", "(Ljava/lang/String;I)V", "", "toString", "()Ljava/lang/String;", "fullContentString$prefs_release", "fullContentString", "Companion", "e5b", "set-unread-timeout", "proxy", "video-preview", "debug-mode", "proxy-domains", "image-width", "image-height", "image-quality", "image-size", "max-msg-length", "max-participants", "max-audio-length", "max-theme-length", "max-description-length", "edit-timeout", "chats-page-size", "keep-connection", "sticker-sections", "stickers-suggestion", "invite-link", "invite-short", "invite-long", "invite-header", "max-cname-length", "v-size-grp", "t-ice-reconnect", "file-upload-max-size", "file-upload-unsupported-types", "music-files-enabled", "chats-preload-period", "max-favorite-chats", "disconnect-timeout", "max-attach-count", "push-alert-timeout", "live-location-enabled", "live-location-release-date", "live-location-send-timeout", "support-account", "support-email", "wakelock-on-push", "mentions_entity_names_limit", "max-readmarks", "max-video-duration-download", "talking-on-muted-mic-trigger-diff", "max-favorite-stickers", "max-favorite-sticker-sets", "min-sticker-size", "max-sticker-size", "default-sticker-size", "min-image-side-size", "min-duration-save-audio-start-time", "valid-interval-audio-start-time", "min-duration-playback-speed", "drafts-sync-enabled", "audio-transcription-locales", "scheduled-messages-enabled", "tracer-non-fatal-crashed-enabled", "subscription-timeout-seconds", "double-tap-reaction", "reactions-max", "react-errors", "msg-get-reactions-page-size", "wm-workers-limit", "wm-check-workers-count-interval-sec", "wm-backlog-worker-check-delay-sec", "wm-backlog-worker-backoff-delay-sec", "wm-workers-offset", "wm-analytics-enabled", "progress-diff-for-notify", "worker-progress-time-diff-for-notify-ms", "max-downloaded-size-for-notify-kb", "fb-exec-replace", "fb-exec-modifiers-names", "log-full", "log-sensitive", "anr-config", "debug-profile-info", "calls-endpoint", "fake-chats", "channels-enabled", "available-complaints", "in-app-review-triggers", "fake-in-app-review", "invite-friends-sheet-frequency", "welcome-sticker-ids", "money-transfer-botid", "non-contact-sync-time", "non-contact-max-chunk-size", "non-contact-collection-interval", "edit-chat-type-screen-enabled", "gce", "lgce", "sse", "gsse", "grse", "gcas", "gcwre", "gcmpe", "group-call-chat-support", "account-nickname-enabled", "send-location-enabled", "reconnect-call-ringtone", "new-media-viewer-enabled", "media-viewer-video-collage-enabled", "new-uploader-enabled", "mytracker-enabled", "chat-video-autoplay-parallel-count", "chat-complaint-enabled", "bot-complaint-enabled", "calls-sdk-audio-dynamic-redundancy", "calls-sdk-net-disable-shared-socket", "conn-timeouts", "safe-mode-enabled", "media-transform", "max-rate-call-threshold", "call-minimum-duration-to-rate", "call-rate", "send-queue-size", "webapp-ds-keys-count", "webapp-ss-keys-count", "webapp-biometry-enabled", "ext-sharing-video", "chat-invite-link-permissions-enabled", "chat-animoji-enabled", "edit-channel-type-screen-enabled", "chat-anim", "send-logs-interval-sec", "saved-messages-aliases", "video-msg-enabled", "analytics-permissions", "stat-session-background-threshold", "bot-start-param", "js-download-delegate", "esia-enabled", "new-admin-permissions", "media-order", "bad-networ-indicator-config", "webm-stickers-enabled", "avatars-screen-enabled", "new-session-logic", "analytics-enabled", "mytracker-log-level", "show-vpn-snackbar", "search-webapps-showcase", "unsafe-files-alert", "player-load-control", "new-settings-storage-screen-enabled", "max-video-message-length", "settings-entry-banners", "appearance-multi-theme-screen-enabled", "net-client-dns-enabled", "prefs_release"}, k = 1, mv = {2, 0, 0})
@Keep
public enum PmsKey {
    f114setunreadtimeout,
    proxy,
    f130videopreview,
    f28debugmode,
    f102proxydomains,
    f49imagewidth,
    f46imageheight,
    f47imagequality,
    f48imagesize,
    f71maxmsglength,
    f72maxparticipants,
    f64maxaudiolength,
    f76maxthemelength,
    f66maxdescriptionlength,
    f36edittimeout,
    f25chatspagesize,
    f57keepconnection,
    f118stickersections,
    f119stickerssuggestion,
    f53invitelink,
    f55inviteshort,
    f54invitelong,
    f52inviteheader,
    f65maxcnamelength,
    f127vsizegrp,
    f123ticereconnect,
    f43fileuploadmaxsize,
    f44fileuploadunsupportedtypes,
    f88musicfilesenabled,
    f26chatspreloadperiod,
    f68maxfavoritechats,
    f31disconnecttimeout,
    f63maxattachcount,
    f103pushalerttimeout,
    f58livelocationenabled,
    f59livelocationreleasedate,
    f60livelocationsendtimeout,
    f121supportaccount,
    f122supportemail,
    f131wakelockonpush,
    mentions_entity_names_limit,
    f74maxreadmarks,
    f77maxvideodurationdownload,
    f124talkingonmutedmictriggerdiff,
    f70maxfavoritestickers,
    f69maxfavoritestickersets,
    f85minstickersize,
    f75maxstickersize,
    f30defaultstickersize,
    f84minimagesidesize,
    f83mindurationsaveaudiostarttime,
    f128validintervalaudiostarttime,
    f82mindurationplaybackspeed,
    f33draftssyncenabled,
    f8audiotranscriptionlocales,
    f109scheduledmessagesenabled,
    f125tracernonfatalcrashedenabled,
    f120subscriptiontimeoutseconds,
    f32doubletapreaction,
    f105reactionsmax,
    f104reacterrors,
    f87msggetreactionspagesize,
    f141wmworkerslimit,
    f140wmcheckworkerscountintervalsec,
    f139wmbacklogworkercheckdelaysec,
    f138wmbacklogworkerbackoffdelaysec,
    f142wmworkersoffset,
    f137wmanalyticsenabled,
    f101progressdifffornotify,
    f143workerprogresstimedifffornotifyms,
    f67maxdownloadedsizefornotifykb,
    f42fbexecreplace,
    f41fbexecmodifiersnames,
    f61logfull,
    f62logsensitive,
    f6anrconfig,
    f29debugprofileinfo,
    f16callsendpoint,
    f39fakechats,
    f19channelsenabled,
    f9availablecomplaints,
    f50inappreviewtriggers,
    f40fakeinappreview,
    f51invitefriendssheetfrequency,
    f136welcomestickerids,
    f86moneytransferbotid,
    f99noncontactsynctime,
    f98noncontactmaxchunksize,
    f97noncontactcollectioninterval,
    f35editchattypescreenenabled,
    gce,
    lgce,
    sse,
    gsse,
    grse,
    gcas,
    gcwre,
    gcmpe,
    f45groupcallchatsupport,
    f3accountnicknameenabled,
    f111sendlocationenabled,
    f106reconnectcallringtone,
    f93newmediaviewerenabled,
    f81mediaviewervideocollageenabled,
    f96newuploaderenabled,
    f89mytrackerenabled,
    f24chatvideoautoplayparallelcount,
    f22chatcomplaintenabled,
    f12botcomplaintenabled,
    f17callssdkaudiodynamicredundancy,
    f18callssdknetdisablesharedsocket,
    f27conntimeouts,
    f107safemodeenabled,
    f80mediatransform,
    f73maxratecallthreshold,
    f14callminimumdurationtorate,
    f15callrate,
    f113sendqueuesize,
    f133webappdskeyscount,
    f134webappsskeyscount,
    f132webappbiometryenabled,
    f38extsharingvideo,
    f23chatinvitelinkpermissionsenabled,
    f21chatanimojienabled,
    f34editchanneltypescreenenabled,
    f20chatanim,
    f112sendlogsintervalsec,
    f108savedmessagesaliases,
    f129videomsgenabled,
    f5analyticspermissions,
    f117statsessionbackgroundthreshold,
    f13botstartparam,
    f56jsdownloaddelegate,
    f37esiaenabled,
    f92newadminpermissions,
    f79mediaorder,
    f11badnetworindicatorconfig,
    f135webmstickersenabled,
    f10avatarsscreenenabled,
    f94newsessionlogic,
    f4analyticsenabled,
    f90mytrackerloglevel,
    f116showvpnsnackbar,
    f110searchwebappsshowcase,
    f126unsafefilesalert,
    f100playerloadcontrol,
    f95newsettingsstoragescreenenabled,
    f78maxvideomessagelength,
    f115settingsentrybanners,
    f7appearancemultithemescreenenabled,
    f91netclientdnsenabled;
    
    public static final e5b Companion = null;
    /* access modifiers changed from: private */
    public static final je7 keys$delegate = null;

    /* JADX WARNING: type inference failed for: r0v152, types: [e5b, java.lang.Object] */
    static {
        PmsKey[] $values;
        $ENTRIES = new v25($values);
        Companion = new Object();
        keys$delegate = new khe(new s4a(27));
    }

    public static u25 getEntries() {
        return $ENTRIES;
    }

    /* access modifiers changed from: private */
    public static final Map keys_delegate$lambda$1() {
        u25 entries = getEntries();
        int Z = mz7.Z(z53.S(entries, 10));
        if (Z < 16) {
            Z = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(Z);
        for (Object next : entries) {
            linkedHashMap.put(((PmsKey) next).name(), next);
        }
        return linkedHashMap;
    }

    public final String fullContentString$prefs_release() {
        return zr6.i("\"", name(), "\"");
    }

    public String toString() {
        return name();
    }
}
