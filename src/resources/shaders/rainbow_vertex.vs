#version 330

layout (location=0) in vec3 position;
layout (location=1) in vec2 texCoord;
layout (location=2) in vec3 vertexNormal;

out vec3 mvVertexNormal;
out vec3 mvVertexPos;
out vec2 mvTextCood;

uniform mat4 modelViewMatrix;
uniform mat4 projectionMatrix;

uniform sampler2D texture_sampler;
uniform float angle; 

void main()
{

    vec4 baseColour = texture(texture_sampler, texCoord);

    float displace = 0.02f; 
    vec4 mvPos = modelViewMatrix * vec4(position, 1.0); 
    mvPos = mvPos + 0.03*sin(10* mvPos.x + (angle/100));

    gl_Position = projectionMatrix * mvPos;
    mvVertexNormal = normalize(modelViewMatrix * vec4(vertexNormal, 0.0)).xyz;
    mvVertexPos = mvPos.xyz;
    mvTextCood = texCoord;

    



}

