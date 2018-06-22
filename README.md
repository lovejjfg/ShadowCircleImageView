
### ShadowCircleImageView

[ ![Download](https://api.bintray.com/packages/lovejjfg/maven/CircleImageView/images/download.svg) ](https://bintray.com/lovejjfg/maven/CircleImageView/_latestVersion)

![ShadowCircleImageView](https://raw.githubusercontent.com/lovejjfg/screenshort/12c86e1440bda3845170396e06963ff4b7c3f4e9/shadow.png)

`compile 'com.lovejjfg:circleimageview:0.0.1-beta'`

CircleImageView fork from [hdodenhof/CircleImageView](https://github.com/hdodenhof/CircleImageView)

### UPDATE:

* 0.0.1-beta

1、Add Shadow function.

2、Fix bug java.lang.IllegalArgumentException: width and height must be > 0 When use Glide add shapeDrawable as place or error drawable:

     Glide.with(getContext())
            .load(url)
            .dontAnimate()
            .placeholder(R.drawable.shape_empt_night)
            .error(R.drawable.ic_launcher)
            .into(mIv);
            
or some other ways like:

    mIv.setImageDrawable(getResources().getDrawable(R.drawable.shape_empt_night));
