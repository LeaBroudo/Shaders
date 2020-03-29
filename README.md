# GLSL Shaders
## Instructions for Running
 My program takes one or two arguments. The first argument is the path to an .obj file, 
 and the second (optional) argument is a .png texture file. 
 
 To run my code with only one argument, do the following:
```
$ cd pa2_starter
$ ant -Dargs=src/resources/models/bob/bob.obj
```

In order to run my code with two arguments, enclose both arguments in quotes to make them one long string like the following:
```
$ cd pa2_starter
$ ant -Dargs="src/resources/models/bob/bob.obj src/resources/models/bob/bob_tex.png"
```
## Shaders 
### Phong 
It does not need a texture argument to run correctly.

![](/gifs/phong.gif)

### Gouraud
It does not need a texture argument to run correctly.

![](/gifs/gouraud.gif)

### Checkerboard
It uses a Phong shading model, allowing it to have smooth shading as well as the Checkerboard effect. It does not need a texture argument to run correctly.

![](/gifs/checker.gif)
   
### Texture-Modulated Smooth Shader
It needs a texture argument to run correctly, so I recommend either of the following commands:

`$ ant -Dargs="src/resources/models/spot/spot.obj src/resources/models/spot/spot_texture.png"`

or

`$ ant -Dargs="src/resources/models/bob/bob.obj src/resources/models/bob/bob_tex.png"`

![](/gifs/text.gif)

### Normal Map
It needs a texture argument to run correctly, so I recommend the following command:

`$ ant -Dargs="src/resources/models/sphere.obj src/resources/textures/brick_texture.png"`

![](/gifs/normal.gif)
  
### Cel (Toon) Shader
It can be used with a texture argument or not.

![](/gifs/cel.gif)
 
### Rainbow Psychedelic Shader!
It does not need a texture argument to run correctly.

![](/gifs/rainbow.gif)
