# Patrons
Patrons/Patrick/2023-12-13
Pont
Structurels
Le pont est un patrons qui permet de de séprarer des classes connexes en deux classemeents 
"abstraction et implémentation" qui peuvent évoluer ensemble.
En utilisant le mot-clé "extends" la class AdvancedRemote hérite les fonctions de la class BasicRemote.
Les classes Radio et Device sont des examples d'interfaces. Les interfaces sont comme des modèles qui define les méthode commun pour être utiliser dans les autres classes.
Le polymorphisme c'est quand tu as plusieurs classes relier par l'héritage. Par exemple la class AdvanceRemote hérite les fonctions de BasicRemote. En le faisant on à accès à la fonction "public void mute()" et les fonctions de BasicRemote aussi.
La composition est quand deux objets sont une relation forte(Un ne peut pas être sans l'autre) ex: AdvancedRemote imports et réfère (créé un objet "device") et dépend cette relation.

Crédit: https://refactoring.guru/design-patterns/bridge